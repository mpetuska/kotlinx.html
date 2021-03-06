package kotlinx.html

import kotlinx.wasm.jsinterop.*

actual fun currentTimeMillis(): Long = allocateArena().let { arena ->
  val previousArena = ArenaManager.currentArena
  ArenaManager.currentArena = arena
  val ptr = js_currentTimeMillis(arena)
  val charIndexes = JsArray(arena, ptr)
  val chars = mutableListOf<Char>()
  for (i in 0 until charIndexes.size) {
    chars.add(charIndexes.getInt(i.toString()).toChar())
  }
  val str = chars.joinToString("")
  ArenaManager.currentArena = previousArena
  freeArena(arena)
  str.toLong()
}

@SymbolName("kotlinx__currentTimeMillis")
private external fun js_currentTimeMillis(arena: Arena): Int

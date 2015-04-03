package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

fun buildSELECT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SELECT.() -> Unit) : Unit = SELECT(attributes, consumer).visit(block)
fun buildLEGEND(attributes : Map<String, String>, consumer : TagConsumer<*>, block : LEGEND.() -> Unit) : Unit = LEGEND(attributes, consumer).visit(block)
fun buildTEXTAREA(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TEXTAREA.() -> Unit) : Unit = TEXTAREA(attributes, consumer).visit(block)
fun buildCAPTION(attributes : Map<String, String>, consumer : TagConsumer<*>, block : CAPTION.() -> Unit) : Unit = CAPTION(attributes, consumer).visit(block)
fun buildDEL(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DEL.() -> Unit) : Unit = DEL(attributes, consumer).visit(block)
fun buildHR(attributes : Map<String, String>, consumer : TagConsumer<*>, block : HR.() -> Unit) : Unit = HR(attributes, consumer).visit(block)
fun buildOUTPUT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : OUTPUT.() -> Unit) : Unit = OUTPUT(attributes, consumer).visit(block)
fun buildEMBED(attributes : Map<String, String>, consumer : TagConsumer<*>, block : EMBED.() -> Unit) : Unit = EMBED(attributes, consumer).visit(block)
fun buildABBR(attributes : Map<String, String>, consumer : TagConsumer<*>, block : ABBR.() -> Unit) : Unit = ABBR(attributes, consumer).visit(block)
fun buildNAV(attributes : Map<String, String>, consumer : TagConsumer<*>, block : NAV.() -> Unit) : Unit = NAV(attributes, consumer).visit(block)
fun buildCANVAS(attributes : Map<String, String>, consumer : TagConsumer<*>, block : CANVAS.() -> Unit) : Unit = CANVAS(attributes, consumer).visit(block)
fun buildVAR_(attributes : Map<String, String>, consumer : TagConsumer<*>, block : VAR_.() -> Unit) : Unit = VAR_(attributes, consumer).visit(block)
fun buildMATHML(attributes : Map<String, String>, consumer : TagConsumer<*>, block : MATHML.() -> Unit) : Unit = MATHML(attributes, consumer).visit(block)
fun buildDFN(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DFN.() -> Unit) : Unit = DFN(attributes, consumer).visit(block)
fun buildSCRIPT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SCRIPT.() -> Unit) : Unit = SCRIPT(attributes, consumer).visit(block)
fun buildINPUT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : INPUT.() -> Unit) : Unit = INPUT(attributes, consumer).visit(block)
fun buildMETA(attributes : Map<String, String>, consumer : TagConsumer<*>, block : META.() -> Unit) : Unit = META(attributes, consumer).visit(block)
fun buildSTYLE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : STYLE.() -> Unit) : Unit = STYLE(attributes, consumer).visit(block)
fun buildMATH(attributes : Map<String, String>, consumer : TagConsumer<*>, block : MATH.() -> Unit) : Unit = MATH(attributes, consumer).visit(block)
fun buildRP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : RP.() -> Unit) : Unit = RP(attributes, consumer).visit(block)
fun buildOBJECT_(attributes : Map<String, String>, consumer : TagConsumer<*>, block : OBJECT_.() -> Unit) : Unit = OBJECT_(attributes, consumer).visit(block)
fun buildSUB(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SUB.() -> Unit) : Unit = SUB(attributes, consumer).visit(block)
fun buildSTRONG(attributes : Map<String, String>, consumer : TagConsumer<*>, block : STRONG.() -> Unit) : Unit = STRONG(attributes, consumer).visit(block)
fun buildRT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : RT.() -> Unit) : Unit = RT(attributes, consumer).visit(block)
fun buildSAMP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SAMP.() -> Unit) : Unit = SAMP(attributes, consumer).visit(block)
fun buildHGROUP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : HGROUP.() -> Unit) : Unit = HGROUP(attributes, consumer).visit(block)
fun buildSUP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SUP.() -> Unit) : Unit = SUP(attributes, consumer).visit(block)
fun buildBR(attributes : Map<String, String>, consumer : TagConsumer<*>, block : BR.() -> Unit) : Unit = BR(attributes, consumer).visit(block)
fun buildIFRAME(attributes : Map<String, String>, consumer : TagConsumer<*>, block : IFRAME.() -> Unit) : Unit = IFRAME(attributes, consumer).visit(block)
fun buildAUDIO(attributes : Map<String, String>, consumer : TagConsumer<*>, block : AUDIO.() -> Unit) : Unit = AUDIO(attributes, consumer).visit(block)
fun buildMAP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : MAP.() -> Unit) : Unit = MAP(attributes, consumer).visit(block)
fun buildTABLE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TABLE.() -> Unit) : Unit = TABLE(attributes, consumer).visit(block)
fun buildA(attributes : Map<String, String>, consumer : TagConsumer<*>, block : A.() -> Unit) : Unit = A(attributes, consumer).visit(block)
fun buildB(attributes : Map<String, String>, consumer : TagConsumer<*>, block : B.() -> Unit) : Unit = B(attributes, consumer).visit(block)
fun buildADDRESS(attributes : Map<String, String>, consumer : TagConsumer<*>, block : ADDRESS.() -> Unit) : Unit = ADDRESS(attributes, consumer).visit(block)
fun buildSVG(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SVG.() -> Unit) : Unit = SVG(attributes, consumer).visit(block)
fun buildBDI(attributes : Map<String, String>, consumer : TagConsumer<*>, block : BDI.() -> Unit) : Unit = BDI(attributes, consumer).visit(block)
fun buildI(attributes : Map<String, String>, consumer : TagConsumer<*>, block : I.() -> Unit) : Unit = I(attributes, consumer).visit(block)
fun buildBDO(attributes : Map<String, String>, consumer : TagConsumer<*>, block : BDO.() -> Unit) : Unit = BDO(attributes, consumer).visit(block)
fun buildMENU(attributes : Map<String, String>, consumer : TagConsumer<*>, block : MENU.() -> Unit) : Unit = MENU(attributes, consumer).visit(block)
fun buildP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : P.() -> Unit) : Unit = P(attributes, consumer).visit(block)
fun buildTFOOT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TFOOT.() -> Unit) : Unit = TFOOT(attributes, consumer).visit(block)
fun buildTD(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TD.() -> Unit) : Unit = TD(attributes, consumer).visit(block)
fun buildQ(attributes : Map<String, String>, consumer : TagConsumer<*>, block : Q.() -> Unit) : Unit = Q(attributes, consumer).visit(block)
fun buildTH(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TH.() -> Unit) : Unit = TH(attributes, consumer).visit(block)
fun buildCITE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : CITE.() -> Unit) : Unit = CITE(attributes, consumer).visit(block)
fun buildPROGRESS(attributes : Map<String, String>, consumer : TagConsumer<*>, block : PROGRESS.() -> Unit) : Unit = PROGRESS(attributes, consumer).visit(block)
fun buildLI(attributes : Map<String, String>, consumer : TagConsumer<*>, block : LI.() -> Unit) : Unit = LI(attributes, consumer).visit(block)
fun buildTR(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TR.() -> Unit) : Unit = TR(attributes, consumer).visit(block)
fun buildSPAN(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SPAN.() -> Unit) : Unit = SPAN(attributes, consumer).visit(block)
fun buildDD(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DD.() -> Unit) : Unit = DD(attributes, consumer).visit(block)
fun buildSMALL(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SMALL.() -> Unit) : Unit = SMALL(attributes, consumer).visit(block)
fun buildCOL(attributes : Map<String, String>, consumer : TagConsumer<*>, block : COL.() -> Unit) : Unit = COL(attributes, consumer).visit(block)
fun buildOPTGROUP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : OPTGROUP.() -> Unit) : Unit = OPTGROUP(attributes, consumer).visit(block)
fun buildTBODY(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TBODY.() -> Unit) : Unit = TBODY(attributes, consumer).visit(block)
fun buildDL(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DL.() -> Unit) : Unit = DL(attributes, consumer).visit(block)
fun buildFIELDSET(attributes : Map<String, String>, consumer : TagConsumer<*>, block : FIELDSET.() -> Unit) : Unit = FIELDSET(attributes, consumer).visit(block)
fun buildSECTION(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SECTION.() -> Unit) : Unit = SECTION(attributes, consumer).visit(block)
fun buildSOURCE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : SOURCE.() -> Unit) : Unit = SOURCE(attributes, consumer).visit(block)
fun buildBODY(attributes : Map<String, String>, consumer : TagConsumer<*>, block : BODY.() -> Unit) : Unit = BODY(attributes, consumer).visit(block)
fun buildDT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DT.() -> Unit) : Unit = DT(attributes, consumer).visit(block)
fun buildDIV(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DIV.() -> Unit) : Unit = DIV(attributes, consumer).visit(block)
fun buildUL(attributes : Map<String, String>, consumer : TagConsumer<*>, block : UL.() -> Unit) : Unit = UL(attributes, consumer).visit(block)
fun buildHTML(attributes : Map<String, String>, consumer : TagConsumer<*>, block : HTML.() -> Unit) : Unit = HTML(attributes, consumer).visit(block)
fun buildDETAILS(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DETAILS.() -> Unit) : Unit = DETAILS(attributes, consumer).visit(block)
fun buildAREA(attributes : Map<String, String>, consumer : TagConsumer<*>, block : AREA.() -> Unit) : Unit = AREA(attributes, consumer).visit(block)
fun buildPRE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : PRE.() -> Unit) : Unit = PRE(attributes, consumer).visit(block)
fun buildBLOCKQUOTE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : BLOCKQUOTE.() -> Unit) : Unit = BLOCKQUOTE(attributes, consumer).visit(block)
fun buildMETER(attributes : Map<String, String>, consumer : TagConsumer<*>, block : METER.() -> Unit) : Unit = METER(attributes, consumer).visit(block)
fun buildEM(attributes : Map<String, String>, consumer : TagConsumer<*>, block : EM.() -> Unit) : Unit = EM(attributes, consumer).visit(block)
fun buildARTICLE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : ARTICLE.() -> Unit) : Unit = ARTICLE(attributes, consumer).visit(block)
fun buildASIDE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : ASIDE.() -> Unit) : Unit = ASIDE(attributes, consumer).visit(block)
fun buildNOSCRIPT(attributes : Map<String, String>, consumer : TagConsumer<*>, block : NOSCRIPT.() -> Unit) : Unit = NOSCRIPT(attributes, consumer).visit(block)
fun buildHEADER(attributes : Map<String, String>, consumer : TagConsumer<*>, block : HEADER.() -> Unit) : Unit = HEADER(attributes, consumer).visit(block)
fun buildOPTION(attributes : Map<String, String>, consumer : TagConsumer<*>, block : OPTION.() -> Unit) : Unit = OPTION(attributes, consumer).visit(block)
fun buildIMG(attributes : Map<String, String>, consumer : TagConsumer<*>, block : IMG.() -> Unit) : Unit = IMG(attributes, consumer).visit(block)
fun buildCODE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : CODE.() -> Unit) : Unit = CODE(attributes, consumer).visit(block)
fun buildFOOTER(attributes : Map<String, String>, consumer : TagConsumer<*>, block : FOOTER.() -> Unit) : Unit = FOOTER(attributes, consumer).visit(block)
fun buildTHEAD(attributes : Map<String, String>, consumer : TagConsumer<*>, block : THEAD.() -> Unit) : Unit = THEAD(attributes, consumer).visit(block)
fun buildLINK(attributes : Map<String, String>, consumer : TagConsumer<*>, block : LINK.() -> Unit) : Unit = LINK(attributes, consumer).visit(block)
fun buildH1(attributes : Map<String, String>, consumer : TagConsumer<*>, block : H1.() -> Unit) : Unit = H1(attributes, consumer).visit(block)
fun buildH2(attributes : Map<String, String>, consumer : TagConsumer<*>, block : H2.() -> Unit) : Unit = H2(attributes, consumer).visit(block)
fun buildH3(attributes : Map<String, String>, consumer : TagConsumer<*>, block : H3.() -> Unit) : Unit = H3(attributes, consumer).visit(block)
fun buildVIDEO(attributes : Map<String, String>, consumer : TagConsumer<*>, block : VIDEO.() -> Unit) : Unit = VIDEO(attributes, consumer).visit(block)
fun buildTITLE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TITLE.() -> Unit) : Unit = TITLE(attributes, consumer).visit(block)
fun buildH4(attributes : Map<String, String>, consumer : TagConsumer<*>, block : H4.() -> Unit) : Unit = H4(attributes, consumer).visit(block)
fun buildH5(attributes : Map<String, String>, consumer : TagConsumer<*>, block : H5.() -> Unit) : Unit = H5(attributes, consumer).visit(block)
fun buildH6(attributes : Map<String, String>, consumer : TagConsumer<*>, block : H6.() -> Unit) : Unit = H6(attributes, consumer).visit(block)
fun buildKEYGEN(attributes : Map<String, String>, consumer : TagConsumer<*>, block : KEYGEN.() -> Unit) : Unit = KEYGEN(attributes, consumer).visit(block)
fun buildHEAD(attributes : Map<String, String>, consumer : TagConsumer<*>, block : HEAD.() -> Unit) : Unit = HEAD(attributes, consumer).visit(block)
fun buildBUTTON(attributes : Map<String, String>, consumer : TagConsumer<*>, block : BUTTON.() -> Unit) : Unit = BUTTON(attributes, consumer).visit(block)
fun buildDIALOG(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DIALOG.() -> Unit) : Unit = DIALOG(attributes, consumer).visit(block)
fun buildPARAM(attributes : Map<String, String>, consumer : TagConsumer<*>, block : PARAM.() -> Unit) : Unit = PARAM(attributes, consumer).visit(block)
fun buildOL(attributes : Map<String, String>, consumer : TagConsumer<*>, block : OL.() -> Unit) : Unit = OL(attributes, consumer).visit(block)
fun buildFIGURE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : FIGURE.() -> Unit) : Unit = FIGURE(attributes, consumer).visit(block)
fun buildDATALIST(attributes : Map<String, String>, consumer : TagConsumer<*>, block : DATALIST.() -> Unit) : Unit = DATALIST(attributes, consumer).visit(block)
fun buildLABEL(attributes : Map<String, String>, consumer : TagConsumer<*>, block : LABEL.() -> Unit) : Unit = LABEL(attributes, consumer).visit(block)
fun buildCOLGROUP(attributes : Map<String, String>, consumer : TagConsumer<*>, block : COLGROUP.() -> Unit) : Unit = COLGROUP(attributes, consumer).visit(block)
fun buildKBD(attributes : Map<String, String>, consumer : TagConsumer<*>, block : KBD.() -> Unit) : Unit = KBD(attributes, consumer).visit(block)
fun buildCOMMAND(attributes : Map<String, String>, consumer : TagConsumer<*>, block : COMMAND.() -> Unit) : Unit = COMMAND(attributes, consumer).visit(block)
fun buildRUBY(attributes : Map<String, String>, consumer : TagConsumer<*>, block : RUBY.() -> Unit) : Unit = RUBY(attributes, consumer).visit(block)
fun buildINS(attributes : Map<String, String>, consumer : TagConsumer<*>, block : INS.() -> Unit) : Unit = INS(attributes, consumer).visit(block)
fun buildFORM(attributes : Map<String, String>, consumer : TagConsumer<*>, block : FORM.() -> Unit) : Unit = FORM(attributes, consumer).visit(block)
fun buildTIME(attributes : Map<String, String>, consumer : TagConsumer<*>, block : TIME.() -> Unit) : Unit = TIME(attributes, consumer).visit(block)
fun buildMARK(attributes : Map<String, String>, consumer : TagConsumer<*>, block : MARK.() -> Unit) : Unit = MARK(attributes, consumer).visit(block)
fun buildBASE(attributes : Map<String, String>, consumer : TagConsumer<*>, block : BASE.() -> Unit) : Unit = BASE(attributes, consumer).visit(block)
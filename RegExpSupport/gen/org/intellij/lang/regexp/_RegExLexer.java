/* The following code was generated by JFlex 1.4.3 on 10/29/14 2:27 PM */

/* It's an automatically generated code. Do not modify it. */
package org.intellij.lang.regexp;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.StringEscapesTokenTypes;
import com.intellij.psi.tree.IElementType;

import java.util.ArrayList;
import java.util.EnumSet;

@SuppressWarnings("ALL")

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/29/14 2:27 PM from the specification file
 * <tt>/Users/bas/Projects/IntelliJ IDEA Ultimate/tools/lexer/../../community/RegExpSupport/src/org/intellij/lang/regexp/regexp-lexer.flex</tt>
 */
class _RegExLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int EMBRACED = 4;
  public static final int NEGATE_CLASS1 = 8;
  public static final int PY_NAMED_GROUP_REF = 22;
  public static final int QUOTED = 2;
  public static final int OPTIONS = 14;
  public static final int PY_COND_REF = 24;
  public static final int YYINITIAL = 0;
  public static final int NAMED_GROUP = 18;
  public static final int CLASS2 = 10;
  public static final int CLASS1 = 6;
  public static final int COMMENT = 16;
  public static final int QUOTED_NAMED_GROUP = 20;
  public static final int PROP = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\2\56\1\13\1\0\1\56\1\66\22\0\1\50\1\62\1\0"+
    "\1\64\1\15\1\0\1\55\1\65\1\4\1\5\1\17\1\20\1\54"+
    "\1\45\1\3\1\0\1\2\7\44\2\1\1\57\1\0\1\63\1\61"+
    "\1\60\1\16\1\0\1\24\1\24\1\32\1\31\1\41\1\37\1\25"+
    "\1\46\1\34\2\47\1\51\1\51\1\51\1\47\1\36\1\40\1\47"+
    "\1\30\2\47\1\27\1\27\1\27\1\47\1\26\1\10\1\12\1\11"+
    "\1\14\1\52\1\0\1\23\1\24\1\33\1\31\1\23\1\23\1\47"+
    "\1\46\1\34\4\47\1\22\1\47\1\35\1\47\1\22\1\27\1\22"+
    "\1\43\1\27\1\27\1\42\1\47\1\25\1\6\1\21\1\7\54\0"+
    "\1\47\12\0\1\47\4\0\1\47\5\0\27\47\1\0\37\47\1\0"+
    "\u013f\47\31\0\162\47\4\0\14\47\16\0\5\47\11\0\1\47\213\0"+
    "\1\47\13\0\1\47\1\0\3\47\1\0\1\47\1\0\24\47\1\0"+
    "\54\47\1\0\46\47\1\0\5\47\4\0\202\47\10\0\105\47\1\0"+
    "\46\47\2\0\2\47\6\0\20\47\41\0\46\47\2\0\1\47\7\0"+
    "\47\47\110\0\33\47\5\0\3\47\56\0\32\47\5\0\13\47\25\0"+
    "\12\53\4\0\2\47\1\0\143\47\1\0\1\47\17\0\2\47\7\0"+
    "\2\47\12\53\3\47\2\0\1\47\20\0\1\47\1\0\36\47\35\0"+
    "\3\47\60\0\46\47\13\0\1\47\u0152\0\66\47\3\0\1\47\22\0"+
    "\1\47\7\0\12\47\4\0\12\53\25\0\10\47\2\0\2\47\2\0"+
    "\26\47\1\0\7\47\1\0\1\47\3\0\4\47\3\0\1\47\36\0"+
    "\2\47\1\0\3\47\4\0\12\53\2\47\23\0\6\47\4\0\2\47"+
    "\2\0\26\47\1\0\7\47\1\0\2\47\1\0\2\47\1\0\2\47"+
    "\37\0\4\47\1\0\1\47\7\0\12\53\2\0\3\47\20\0\11\47"+
    "\1\0\3\47\1\0\26\47\1\0\7\47\1\0\2\47\1\0\5\47"+
    "\3\0\1\47\22\0\1\47\17\0\2\47\4\0\12\53\25\0\10\47"+
    "\2\0\2\47\2\0\26\47\1\0\7\47\1\0\2\47\1\0\5\47"+
    "\3\0\1\47\36\0\2\47\1\0\3\47\4\0\12\53\1\0\1\47"+
    "\21\0\1\47\1\0\6\47\3\0\3\47\1\0\4\47\3\0\2\47"+
    "\1\0\1\47\1\0\2\47\3\0\2\47\3\0\3\47\3\0\10\47"+
    "\1\0\3\47\55\0\11\53\25\0\10\47\1\0\3\47\1\0\27\47"+
    "\1\0\12\47\1\0\5\47\46\0\2\47\4\0\12\53\25\0\10\47"+
    "\1\0\3\47\1\0\27\47\1\0\12\47\1\0\5\47\3\0\1\47"+
    "\40\0\1\47\1\0\2\47\4\0\12\53\25\0\10\47\1\0\3\47"+
    "\1\0\27\47\1\0\20\47\46\0\2\47\4\0\12\53\25\0\22\47"+
    "\3\0\30\47\1\0\11\47\1\0\1\47\2\0\7\47\72\0\60\47"+
    "\1\0\2\47\14\0\7\47\11\0\12\53\47\0\2\47\1\0\1\47"+
    "\2\0\2\47\1\0\1\47\2\0\1\47\6\0\4\47\1\0\7\47"+
    "\1\0\3\47\1\0\1\47\1\0\1\47\2\0\2\47\1\0\4\47"+
    "\1\0\2\47\11\0\1\47\2\0\5\47\1\0\1\47\11\0\12\53"+
    "\2\0\2\47\42\0\1\47\37\0\12\53\26\0\10\47\1\0\42\47"+
    "\35\0\4\47\164\0\42\47\1\0\5\47\1\0\2\47\25\0\12\53"+
    "\6\0\6\47\112\0\46\47\12\0\51\47\7\0\132\47\5\0\104\47"+
    "\5\0\122\47\6\0\7\47\1\0\77\47\1\0\1\47\1\0\4\47"+
    "\2\0\7\47\1\0\1\47\1\0\4\47\2\0\47\47\1\0\1\47"+
    "\1\0\4\47\2\0\37\47\1\0\1\47\1\0\4\47\2\0\7\47"+
    "\1\0\1\47\1\0\4\47\2\0\7\47\1\0\7\47\1\0\27\47"+
    "\1\0\37\47\1\0\1\47\1\0\4\47\2\0\7\47\1\0\47\47"+
    "\1\0\23\47\16\0\11\53\56\0\125\47\14\0\u026c\47\2\0\10\47"+
    "\12\0\32\47\5\0\113\47\25\0\15\47\1\0\4\47\16\0\22\47"+
    "\16\0\22\47\16\0\15\47\1\0\3\47\17\0\64\47\43\0\1\47"+
    "\4\0\1\47\3\0\12\53\46\0\12\53\6\0\130\47\10\0\51\47"+
    "\127\0\35\47\51\0\12\53\36\47\2\0\5\47\u038b\0\154\47\224\0"+
    "\234\47\4\0\132\47\6\0\26\47\2\0\6\47\2\0\46\47\2\0"+
    "\6\47\2\0\10\47\1\0\1\47\1\0\1\47\1\0\1\47\1\0"+
    "\37\47\2\0\65\47\1\0\7\47\1\0\1\47\3\0\3\47\1\0"+
    "\7\47\3\0\4\47\2\0\6\47\4\0\15\47\5\0\3\47\1\0"+
    "\7\47\164\0\1\47\15\0\1\47\202\0\1\47\4\0\1\47\2\0"+
    "\12\47\1\0\1\47\3\0\5\47\6\0\1\47\1\0\1\47\1\0"+
    "\1\47\1\0\4\47\1\0\3\47\1\0\7\47\3\0\3\47\5\0"+
    "\5\47\u0ebb\0\2\47\52\0\5\47\5\0\2\47\4\0\126\47\6\0"+
    "\3\47\1\0\132\47\1\0\4\47\5\0\50\47\4\0\136\47\21\0"+
    "\30\47\70\0\20\47\u0200\0\u19b6\47\112\0\u51a6\47\132\0\u048d\47\u0773\0"+
    "\u2ba4\47\u215c\0\u012e\47\2\0\73\47\225\0\7\47\14\0\5\47\5\0"+
    "\1\47\1\0\12\47\1\0\15\47\1\0\5\47\1\0\1\47\1\0"+
    "\2\47\1\0\2\47\1\0\154\47\41\0\u016b\47\22\0\100\47\2\0"+
    "\66\47\50\0\14\47\164\0\5\47\1\0\207\47\23\0\12\53\7\0"+
    "\32\47\6\0\32\47\13\0\131\47\3\0\6\47\2\0\6\47\2\0"+
    "\6\47\2\0\3\47\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\1\2\4\0\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\3\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\11\1\36\1\3\1\37\1\40\1\37\1\41\1\42"+
    "\1\43\1\1\1\44\1\45\1\2\1\46\1\47\1\50"+
    "\1\51\1\0\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\2\62\1\63\1\11\1\64\1\65\1\66"+
    "\1\53\1\67\1\70\1\71\1\72\1\73\1\74\1\0"+
    "\1\75\1\76\1\77\1\100\1\0\1\101\1\102\1\103"+
    "\1\104\2\65\1\66\1\53\1\105\1\106\1\107\1\110"+
    "\1\0\1\103\1\111\2\65\1\66\1\112\1\113\1\103"+
    "\1\65\1\66\1\65\1\114\4\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u02cb\0\u0302"+
    "\0\u02cb\0\u02cb\0\u0339\0\u0370\0\u02cb\0\u02cb\0\u02cb\0\u02cb"+
    "\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u03a7\0\u02cb"+
    "\0\u03de\0\u02cb\0\u0415\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u044c"+
    "\0\u02cb\0\u0483\0\u02cb\0\u04ba\0\u02cb\0\u02cb\0\u0339\0\u02cb"+
    "\0\u02cb\0\u02cb\0\u04f1\0\u0528\0\u02cb\0\u02cb\0\u02cb\0\u02cb"+
    "\0\u055f\0\u02cb\0\u0596\0\u02cb\0\u05cd\0\u0604\0\u02cb\0\u02cb"+
    "\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u063b\0\u02cb\0\u02cb\0\u02cb"+
    "\0\u0672\0\u06a9\0\u06e0\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u02cb"+
    "\0\u02cb\0\u0717\0\u02cb\0\u02cb\0\u02cb\0\u074e\0\u0785\0\u02cb"+
    "\0\u02cb\0\u07bc\0\u02cb\0\u07f3\0\u082a\0\u0861\0\u0898\0\u02cb"+
    "\0\u02cb\0\u02cb\0\u02cb\0\u08cf\0\u0906\0\u02cb\0\u093d\0\u02cb"+
    "\0\u0974\0\u05cd\0\u02cb\0\u02cb\0\u09ab\0\u09e2\0\u0a19\0\u02cb"+
    "\0\u0a50\0\u0a87\0\u0abe\0\u0af5";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\16\1\17\1\20\1\21\1\22\1\16\1\23\1\16"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\23\16\1\34\2\16\1\35\5\16\1\25\5\16\1\36"+
    "\1\16\1\25\12\16\1\37\54\16\1\40\2\41\4\40"+
    "\1\42\12\40\22\43\1\41\1\40\2\43\1\40\1\43"+
    "\1\40\1\41\1\44\12\40\11\45\1\46\1\45\1\0"+
    "\66\45\1\0\1\47\52\45\6\16\1\22\1\16\1\50"+
    "\1\51\1\52\1\53\1\26\30\16\1\34\7\16\1\54"+
    "\1\53\7\16\1\53\6\55\1\56\1\55\1\57\1\55"+
    "\1\24\13\55\1\60\1\55\1\60\1\55\1\60\3\55"+
    "\1\60\12\55\1\60\15\55\5\61\1\62\14\61\22\63"+
    "\1\61\1\64\2\63\1\61\1\63\5\61\1\65\7\61"+
    "\13\11\1\66\52\11\1\66\22\61\22\43\2\61\2\43"+
    "\1\61\1\43\6\61\1\67\30\61\22\43\2\61\2\43"+
    "\1\61\1\43\13\61\1\70\6\61\1\62\14\61\22\43"+
    "\2\61\2\43\1\61\1\43\16\61\2\41\2\61\1\62"+
    "\14\61\22\43\1\41\1\61\2\43\1\61\1\43\1\61"+
    "\1\41\13\61\105\0\1\71\61\0\1\72\2\0\1\73"+
    "\52\0\1\74\1\75\1\76\4\77\1\74\1\77\1\74"+
    "\1\77\1\100\6\77\2\101\3\102\3\103\1\104\1\105"+
    "\1\104\2\106\1\107\1\110\1\107\1\111\1\112\1\113"+
    "\1\77\1\114\1\107\1\100\1\107\4\74\1\100\7\74"+
    "\1\100\41\0\1\115\26\0\2\41\41\0\1\41\6\0"+
    "\1\41\14\0\2\43\17\0\23\43\1\0\2\43\1\0"+
    "\3\43\24\0\1\116\2\0\1\73\52\0\1\74\1\75"+
    "\1\76\4\77\1\74\1\77\1\117\1\77\1\100\6\77"+
    "\2\101\3\102\3\103\1\104\1\105\1\104\2\106\1\107"+
    "\1\110\1\107\1\111\1\112\1\113\1\77\1\114\1\107"+
    "\1\100\1\107\4\74\1\100\7\74\1\100\55\0\1\120"+
    "\33\0\22\63\2\0\2\63\1\0\1\63\37\0\22\64"+
    "\2\0\2\64\1\0\1\64\21\0\1\121\31\0\1\122"+
    "\20\0\2\123\1\124\1\125\1\126\1\127\1\130\12\0"+
    "\1\131\56\0\2\75\41\0\1\75\24\0\1\132\41\0"+
    "\1\132\22\0\67\133\1\0\2\134\3\0\1\135\14\0"+
    "\2\134\4\0\3\134\3\0\1\134\1\0\1\134\2\0"+
    "\1\134\23\0\2\136\20\0\2\136\4\0\3\136\3\0"+
    "\1\136\1\0\1\136\2\0\1\136\23\0\1\75\1\137"+
    "\41\0\1\137\103\0\1\140\1\0\1\141\64\0\1\142"+
    "\1\143\4\0\5\144\1\0\61\144\2\0\1\145\41\0"+
    "\1\145\23\0\2\146\20\0\2\146\4\0\3\146\3\0"+
    "\1\146\1\0\1\146\2\0\1\146\23\0\2\147\4\0"+
    "\1\150\13\0\2\147\4\0\3\147\3\0\1\147\1\0"+
    "\1\147\2\0\1\147\23\0\2\151\20\0\2\151\4\0"+
    "\3\151\3\0\1\151\1\0\1\151\2\0\1\151\23\0"+
    "\1\75\1\152\41\0\1\152\22\0\5\144\1\153\61\144"+
    "\2\0\1\154\41\0\1\154\23\0\2\155\4\0\1\146"+
    "\13\0\2\155\4\0\3\155\3\0\1\155\1\0\1\155"+
    "\2\0\1\155\23\0\2\156\20\0\2\156\4\0\3\156"+
    "\3\0\1\156\1\0\1\156\2\0\1\156\23\0\2\157"+
    "\4\0\1\146\13\0\2\157\4\0\3\157\3\0\1\157"+
    "\1\0\1\157\2\0\1\157\23\0\2\160\20\0\2\160"+
    "\4\0\3\160\3\0\1\160\1\0\1\160\2\0\1\160"+
    "\23\0\2\161\4\0\1\146\13\0\2\161\4\0\3\161"+
    "\3\0\1\161\1\0\1\161\2\0\1\161\23\0\2\162"+
    "\4\0\1\146\13\0\2\162\4\0\3\162\3\0\1\162"+
    "\1\0\1\162\2\0\1\162\23\0\2\163\4\0\1\146"+
    "\13\0\2\163\4\0\3\163\3\0\1\163\1\0\1\163"+
    "\2\0\1\163\23\0\2\164\4\0\1\146\13\0\2\164"+
    "\4\0\3\164\3\0\1\164\1\0\1\164\2\0\1\164"+
    "\23\0\2\164\4\0\1\150\13\0\2\164\4\0\3\164"+
    "\3\0\1\164\1\0\1\164\2\0\1\164\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2860];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\2\1\4\0\2\11\1\1\2\11\2\1\12\11"+
    "\1\1\1\11\1\1\1\11\1\1\4\11\1\1\1\11"+
    "\1\1\1\11\1\1\2\11\1\1\3\11\2\1\4\11"+
    "\1\1\1\11\1\0\1\11\2\1\6\11\1\1\3\11"+
    "\3\1\6\11\1\0\3\11\1\1\1\0\2\11\1\1"+
    "\1\11\4\1\4\11\1\0\1\1\1\11\1\1\1\11"+
    "\2\1\2\11\3\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    // This adds support for nested states. I'm no JFlex pro, so maybe this is overkill, but it works quite well.
    final ArrayList<Integer> states = new ArrayList();

    // This was an idea to use the regex implementation for XML schema regexes (which use a slightly different syntax)
    // as well, but is currently unfinished as it requires to tweak more places than just the lexer.
    private boolean xmlSchemaMode;

    int capturingGroupCount = 0;

    private boolean allowDanglingMetacharacters;
    private boolean allowNestedCharacterClasses;
    private boolean allowOctalNoLeadingZero;
    private boolean allowHexDigitClass;
    private boolean allowEmptyCharacterClass;
    private boolean allowHorizontalWhitespaceClass;
    private boolean allowCategoryShorthand;

    _RegExLexer(EnumSet<RegExpCapability> capabilities) {
      this((java.io.Reader)null);
      this.xmlSchemaMode = capabilities.contains(RegExpCapability.XML_SCHEMA_MODE);
      this.allowDanglingMetacharacters = capabilities.contains(RegExpCapability.DANGLING_METACHARACTERS);
      this.allowNestedCharacterClasses = capabilities.contains(RegExpCapability.NESTED_CHARACTER_CLASSES);
      this.allowOctalNoLeadingZero = capabilities.contains(RegExpCapability.OCTAL_NO_LEADING_ZERO);
      this.commentMode = capabilities.contains(RegExpCapability.COMMENT_MODE);
      this.allowHexDigitClass = capabilities.contains(RegExpCapability.ALLOW_HEX_DIGIT_CLASS);
      this.allowHorizontalWhitespaceClass = capabilities.contains(RegExpCapability.ALLOW_HORIZONTAL_WHITESPACE_CLASS);
      this.allowEmptyCharacterClass = capabilities.contains(RegExpCapability.ALLOW_EMPTY_CHARACTER_CLASS);
      this.allowCategoryShorthand = capabilities.contains(RegExpCapability.UNICODE_CATEGORY_SHORTHAND);
    }

    private void yypushstate(int state) {
        states.add(yystate());
        yybegin(state);
    }

    private void yypopstate() {
        final int state = states.remove(states.size() - 1);
        yybegin(state);
    }

    private void handleOptions() {
      final String o = yytext().toString();
      if (o.contains("x")) {
        commentMode = !o.startsWith("-");
      }
    }

    // tracks whether the lexer is in comment mode, i.e. whether whitespace is not significant and whether to ignore
    // text after '#' till EOL
    boolean commentMode = false;


  _RegExLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _RegExLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1348) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 76: 
          { return RegExpTT.UNICODE_CHAR;
          }
        case 77: break;
        case 7: 
          { if (yystate() != CLASS2) yypushstate(EMBRACED); return RegExpTT.LBRACE;
          }
        case 78: break;
        case 24: 
          { return RegExpTT.COMMA;
          }
        case 79: break;
        case 62: 
          { return RegExpTT.POS_LOOKAHEAD;
          }
        case 80: break;
        case 75: 
          { return RegExpTT.COMMENT;
          }
        case 81: break;
        case 70: 
          { yybegin(NAMED_GROUP); return RegExpTT.PYTHON_NAMED_GROUP;
          }
        case 82: break;
        case 14: 
          { return RegExpTT.STAR;
          }
        case 83: break;
        case 60: 
          { yybegin(PY_COND_REF); return RegExpTT.PYTHON_COND_REF;
          }
        case 84: break;
        case 49: 
          { return RegExpTT.CHAR_CLASS;
          }
        case 85: break;
        case 36: 
          { handleOptions(); return RegExpTT.OPTIONS_OFF;
          }
        case 86: break;
        case 56: 
          { yypopstate(); return RegExpTT.QUOTE_END;
          }
        case 87: break;
        case 35: 
          { yybegin(YYINITIAL); return RegExpTT.GROUP_END;
          }
        case 88: break;
        case 41: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { if (allowEmptyCharacterClass) yypushstate(CLASS2); else yypushstate(CLASS1);
                            return RegExpTT.CLASS_BEGIN;
          }
        case 89: break;
        case 37: 
          { yybegin(YYINITIAL); return RegExpTT.COLON;
          }
        case 90: break;
        case 6: 
          { return RegExpTT.GROUP_END;
          }
        case 91: break;
        case 25: 
          { assert false : yytext();
          }
        case 92: break;
        case 18: 
          { return commentMode ? com.intellij.psi.TokenType.WHITE_SPACE : RegExpTT.CHARACTER;
          }
        case 93: break;
        case 46: 
          { return commentMode ? RegExpTT.CHARACTER : RegExpTT.REDUNDANT_ESCAPE;
          }
        case 94: break;
        case 23: 
          { return RegExpTT.NAME;
          }
        case 95: break;
        case 29: 
          { yypopstate(); return RegExpTT.CLASS_END;
          }
        case 96: break;
        case 34: 
          { yybegin(YYINITIAL); return RegExpTT.BAD_CHARACTER;
          }
        case 97: break;
        case 52: 
          { yypushstate(QUOTED); return RegExpTT.QUOTE_BEGIN;
          }
        case 98: break;
        case 21: 
          { return RegExpTT.NUMBER;
          }
        case 99: break;
        case 4: 
          { return RegExpTT.DOT;
          }
        case 100: break;
        case 72: 
          { return RegExpTT.NEG_LOOKBEHIND;
          }
        case 101: break;
        case 33: 
          { yypopstate(); if (allowCategoryShorthand) return RegExpTT.CATEGORY_SHORT_HAND; else yypushback(1);
          }
        case 102: break;
        case 44: 
          { return (allowOctalNoLeadingZero ? RegExpTT.OCT_CHAR : RegExpTT.BAD_OCT_VALUE);
          }
        case 103: break;
        case 63: 
          { return RegExpTT.NEG_LOOKAHEAD;
          }
        case 104: break;
        case 10: 
          { return commentMode ? com.intellij.psi.TokenType.WHITE_SPACE : RegExpTT.CTRL_CHARACTER;
          }
        case 105: break;
        case 61: 
          { return RegExpTT.NON_CAPT_GROUP;
          }
        case 106: break;
        case 65: 
          { yybegin(QUOTED_NAMED_GROUP); return RegExpTT.RUBY_QUOTED_NAMED_GROUP;
          }
        case 107: break;
        case 28: 
          { if (allowNestedCharacterClasses) {
                           yypushstate(CLASS2);
                           return RegExpTT.CLASS_BEGIN;
                        }
                        return RegExpTT.CHARACTER;
          }
        case 108: break;
        case 19: 
          { if (commentMode) { yypushstate(COMMENT); return RegExpTT.COMMENT; } else return RegExpTT.CHARACTER;
          }
        case 109: break;
        case 51: 
          { yypushstate(PROP); return RegExpTT.PROPERTY;
          }
        case 110: break;
        case 8: 
          { yypushstate(CLASS2);
                            return RegExpTT.CLASS_BEGIN;
          }
        case 111: break;
        case 71: 
          { return RegExpTT.POS_LOOKBEHIND;
          }
        case 112: break;
        case 20: 
          { if (allowDanglingMetacharacters) {
                          yypopstate(); yypushback(1);
                        } else {
                          return RegExpTT.BAD_CHARACTER;
                        }
          }
        case 113: break;
        case 73: 
          { return RegExpTT.HEX_CHAR;
          }
        case 114: break;
        case 1: 
          { handleOptions(); return RegExpTT.OPTIONS_ON;
          }
        case 115: break;
        case 43: 
          { if (yystate() == CLASS2) return RegExpTT.ESC_CHARACTER;
                                while (yylength() > 2 && Integer.parseInt(yytext().toString().substring(1)) > capturingGroupCount) {
                                  yypushback(1);
                                }
                                return RegExpTT.BACKREF;
          }
        case 116: break;
        case 2: 
          { yypopstate(); return RegExpTT.COMMENT;
          }
        case 117: break;
        case 17: 
          { return RegExpTT.MINUS;
          }
        case 118: break;
        case 47: 
          { return RegExpTT.ESC_CTRL_CHARACTER;
          }
        case 119: break;
        case 32: 
          { yypopstate(); yypushstate(EMBRACED); return RegExpTT.LBRACE;
          }
        case 120: break;
        case 13: 
          { return RegExpTT.QUEST;
          }
        case 121: break;
        case 5: 
          { capturingGroupCount++; return RegExpTT.GROUP_BEGIN;
          }
        case 122: break;
        case 15: 
          { return RegExpTT.PLUS;
          }
        case 123: break;
        case 67: 
          { return RegExpTT.OCT_CHAR;
          }
        case 124: break;
        case 39: 
          { yybegin(YYINITIAL); return RegExpTT.QUOTE;
          }
        case 125: break;
        case 31: 
          { yypopstate(); yypushback(1);
          }
        case 126: break;
        case 27: 
          { yybegin(CLASS1); return RegExpTT.CARET;
          }
        case 127: break;
        case 57: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { if (allowNestedCharacterClasses) {
                              yypushstate(CLASS1);
                              return RegExpTT.CLASS_BEGIN;
                            }
                            return RegExpTT.CHARACTER;
          }
        case 128: break;
        case 58: 
          { if (!allowNestedCharacterClasses) return RegExpTT.CHARACTER;
                                return RegExpTT.REDUNDANT_ESCAPE;
          }
        case 129: break;
        case 38: 
          { yybegin(YYINITIAL); return RegExpTT.GT;
          }
        case 130: break;
        case 69: 
          { yybegin(PY_NAMED_GROUP_REF); return RegExpTT.PYTHON_NAMED_GROUP_REF;
          }
        case 131: break;
        case 16: 
          { return RegExpTT.UNION;
          }
        case 132: break;
        case 3: 
          { return RegExpTT.CHARACTER;
          }
        case 133: break;
        case 64: 
          { yybegin(NAMED_GROUP); return RegExpTT.RUBY_NAMED_GROUP;
          }
        case 134: break;
        case 40: 
          { yybegin(OPTIONS); return RegExpTT.SET_OPTIONS;
          }
        case 135: break;
        case 26: 
          { yybegin(CLASS2); return RegExpTT.CHARACTER;
          }
        case 136: break;
        case 68: 
          { if (xmlSchemaMode) { yypushback(1); return RegExpTT.CHAR_CLASS; } else return RegExpTT.CTRL;
          }
        case 137: break;
        case 30: 
          { return commentMode ? com.intellij.psi.TokenType.WHITE_SPACE : RegExpTT.ESC_CHARACTER;
          }
        case 138: break;
        case 12: 
          { return RegExpTT.DOLLAR;
          }
        case 139: break;
        case 59: 
          { if (allowNestedCharacterClasses) return RegExpTT.ANDAND; else yypushback(1); return RegExpTT.CHARACTER;
          }
        case 140: break;
        case 50: 
          { if (xmlSchemaMode) return RegExpTT.CHAR_CLASS; else return StringEscapesTokenTypes.INVALID_CHARACTER_ESCAPE_TOKEN;
          }
        case 141: break;
        case 42: 
          { return RegExpTT.REDUNDANT_ESCAPE;
          }
        case 142: break;
        case 55: 
          { return (allowHexDigitClass || allowHorizontalWhitespaceClass ? RegExpTT.CHAR_CLASS : StringEscapesTokenTypes.INVALID_CHARACTER_ESCAPE_TOKEN);
          }
        case 143: break;
        case 48: 
          { return yystate() != CLASS2 ? RegExpTT.BOUNDARY : RegExpTT.ESC_CHARACTER;
          }
        case 144: break;
        case 22: 
          { yypopstate(); return RegExpTT.RBRACE;
          }
        case 145: break;
        case 66: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { if (allowEmptyCharacterClass) yypushstate(CLASS2); else yypushstate(NEGATE_CLASS1);
                              return RegExpTT.CLASS_BEGIN;
          }
        case 146: break;
        case 54: 
          { return StringEscapesTokenTypes.INVALID_UNICODE_ESCAPE_TOKEN;
          }
        case 147: break;
        case 53: 
          { return RegExpTT.BAD_HEX_VALUE;
          }
        case 148: break;
        case 9: 
          { return StringEscapesTokenTypes.INVALID_CHARACTER_ESCAPE_TOKEN;
          }
        case 149: break;
        case 11: 
          { return RegExpTT.CARET;
          }
        case 150: break;
        case 45: 
          { return RegExpTT.ESC_CHARACTER;
          }
        case 151: break;
        case 74: 
          { if (allowOctalNoLeadingZero) return RegExpTT.OCT_CHAR;
                                if (yystate() == CLASS2) return RegExpTT.ESC_CHARACTER;
                                while (yylength() > 2 && Integer.parseInt(yytext().toString().substring(1)) > capturingGroupCount) {
                                  yypushback(1);
                                }
                                return RegExpTT.BACKREF;
          }
        case 152: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

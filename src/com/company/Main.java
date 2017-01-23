package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String names [] = {"AliceBlue,#F0F8FF,AntiqueWhite,#FAEBD7,Aqua,#00FFFF,Aquamarine,#7FFFD4,Azure,#F0FFFF,[5] => ,Beige,    [6] => #F5F5DC,    [6] => ,Bisque,    [7] => #FFE4C4,    [7] => ,Black,    [8] => #000000,    [8] => ,BlanchedAlmond,    [9] => #FFEBCD,    [9] => ,Blue,    [10] => #0000FF,    [10] => ,BlueViolet,    [11] => #8A2BE2,    [11] => ,Brown,    [12] => #A52A2A,    [12] => ,BurlyWood,    [13] => #DEB887,    [13] => ,CadetBlue,    [14] => #5F9EA0,    [14] => ,Chartreuse,    [15] => #7FFF00,    [15] => ,Chocolate,    [16] => #D2691E,    [16] => ,Coral,    [17] => #FF7F50,    [17] => ,CornflowerBlue,    [18] => #6495ED,    [18] => ,Cornsilk,    [19] => #FFF8DC,    [19] => ,Crimson,    [20] => #DC143C,    [20] => ,Cyan,    [21] => #00FFFF,    [21] => ,DarkBlue,    [22] => #00008B,    [22] => ,DarkCyan,    [23] => #008B8B,    [23] => ,DarkGoldenRod,    [24] => #B8860B,    [24] => ,DarkGray,    [25] => #A9A9A9,    [25] => ,DarkGrey,    [26] => #A9A9A9,    [26] => ,DarkGreen,    [27] => #006400,    [27] => ,DarkKhaki,    [28] => #BDB76B,    [28] => ,DarkMagenta,    [29] => #8B008B,    [29] => ,DarkOliveGreen,    [30] => #556B2F,    [30] => ,DarkOrange,    [31] => #FF8C00,    [31] => ,DarkOrchid,    [32] => #9932CC,    [32] => ,DarkRed,    [33] => #8B0000,    [33] => ,DarkSalmon,    [34] => #E9967A,    [34] => ,DarkSeaGreen,    [35] => #8FBC8F,    [35] => ,DarkSlateBlue,    [36] => #483D8B,    [36] => ,DarkSlateGray,    [37] => #2F4F4F,    [37] => ,DarkSlateGrey,    [38] => #2F4F4F,    [38] => ,DarkTurquoise,    [39] => #00CED1,    [39] => ,DarkViolet,    [40] => #9400D3,    [40] => ,DeepPink,    [41] => #FF1493,    [41] => ,DeepSkyBlue,    [42] => #00BFFF,    [42] => ,DimGray,    [43] => #696969,    [43] => ,DimGrey,    [44] => #696969,    [44] => ,DodgerBlue,    [45] => #1E90FF,    [45] => ,FireBrick,    [46] => #B22222,    [46] => ,FloralWhite,    [47] => #FFFAF0,    [47] => ,ForestGreen,    [48] => #228B22,    [48] => ,Fuchsia,    [49] => #FF00FF,    [49] => ,Gainsboro,    [50] => #DCDCDC,    [50] => ,GhostWhite,    [51] => #F8F8FF,    [51] => ,Gold,    [52] => #FFD700,    [52] => ,GoldenRod,    [53] => #DAA520,    [53] => ,Gray,    [54] => #808080,    [54] => ,Grey,    [55] => #808080,    [55] => ,Green,    [56] => #008000,    [56] => ,GreenYellow,    [57] => #ADFF2F,    [57] => ,HoneyDew,    [58] => #F0FFF0,    [58] => ,HotPink,    [59] => #FF69B4,    [59] => ,IndianRed ,    [60] => #CD5C5C,    [60] => ,Indigo ,    [61] => #4B0082,    [61] => ,Ivory,    [62] => #FFFFF0,    [62] => ,Khaki,    [63] => #F0E68C,    [63] => ,Lavender,    [64] => #E6E6FA,    [64] => ,LavenderBlush,    [65] => #FFF0F5,    [65] => ,LawnGreen,    [66] => #7CFC00,    [66] => ,LemonChiffon,    [67] => #FFFACD,    [67] => ,LightBlue,    [68] => #ADD8E6,    [68] => ,LightCoral,    [69] => #F08080,    [69] => ,LightCyan,    [70] => #E0FFFF,    [70] => ,LightGoldenRodYellow,    [71] => #FAFAD2,    [71] => ,LightGray,    [72] => #D3D3D3,    [72] => ,LightGrey,    [73] => #D3D3D3,    [73] => ,LightGreen,    [74] => #90EE90,    [74] => ,LightPink,    [75] => #FFB6C1,    [75] => ,LightSalmon,    [76] => #FFA07A,    [76] => ,LightSeaGreen,    [77] => #20B2AA,    [77] => ,LightSkyBlue,    [78] => #87CEFA,    [78] => ,LightSlateGray,    [79] => #778899,    [79] => ,LightSlateGrey,    [80] => #778899,    [80] => ,LightSteelBlue,    [81] => #B0C4DE,    [81] => ,LightYellow,    [82] => #FFFFE0,    [82] => ,Lime,    [83] => #00FF00,    [83] => ,LimeGreen,    [84] => #32CD32,    [84] => ,Linen,    [85] => #FAF0E6,    [85] => ,Magenta,    [86] => #FF00FF,    [86] => ,Maroon,    [87] => #800000,    [87] => ,MediumAquaMarine,    [88] => #66CDAA,    [88] => ,MediumBlue,    [89] => #0000CD,    [89] => ,MediumOrchid,    [90] => #BA55D3,    [90] => ,MediumPurple,    [91] => #9370DB,    [91] => ,MediumSeaGreen,    [92] => #3CB371,    [92] => ,MediumSlateBlue,    [93] => #7B68EE,    [93] => ,MediumSpringGreen,    [94] => #00FA9A,    [94] => ,MediumTurquoise,    [95] => #48D1CC,    [95] => ,MediumVioletRed,    [96] => #C71585,    [96] => ,MidnightBlue,    [97] => #191970,    [97] => ,MintCream,    [98] => #F5FFFA,    [98] => ,MistyRose,    [99] => #FFE4E1,    [99] => ,Moccasin,    [100] => #FFE4B5,    [100] => ,NavajoWhite,    [101] => #FFDEAD,    [101] => ,Navy,    [102] => #000080,    [102] => ,OldLace,    [103] => #FDF5E6,    [103] => ,Olive,    [104] => #808000,    [104] => ,OliveDrab,    [105] => #6B8E23,    [105] => ,Orange,    [106] => #FFA500,    [106] => ,OrangeRed,    [107] => #FF4500,    [107] => ,Orchid,    [108] => #DA70D6,    [108] => ,PaleGoldenRod,    [109] => #EEE8AA,    [109] => ,PaleGreen,    [110] => #98FB98,    [110] => ,PaleTurquoise,    [111] => #AFEEEE,    [111] => ,PaleVioletRed,    [112] => #DB7093,    [112] => ,PapayaWhip,    [113] => #FFEFD5,    [113] => ,PeachPuff,    [114] => #FFDAB9,    [114] => ,Peru,    [115] => #CD853F,    [115] => ,Pink,    [116] => #FFC0CB,    [116] => ,Plum,    [117] => #DDA0DD,    [117] => ,PowderBlue,    [118] => #B0E0E6,    [118] => ,Purple,    [119] => #800080,    [119] => ,RebeccaPurple,    [120] => #663399,    [120] => ,Red,    [121] => #FF0000,    [121] => ,RosyBrown,    [122] => #BC8F8F,    [122] => ,RoyalBlue,    [123] => #4169E1,    [123] => ,SaddleBrown,    [124] => #8B4513,    [124] => ,Salmon,    [125] => #FA8072,SandyBrown,#F4A460,SeaGreen,#2E8B57,SeaShell,#FFF5EE,Sienna,#A0522D,Silver,#C0C0C0,SkyBlue,#87CEEB,SlateBlue,#6A5ACD,SlateGray,#708090,SlateGrey,#708090,Snow,#FFFAFA,SpringGreen,#00FF7F,SteelBlue,#4682B4,Tan,#D2B48C,Teal,#008080,Thistle,D8BFD8,Tomato,FF6347,Turquoise,#40E0D0,Violet,#EE82EE,Wheat,#F5DEB3,White,#FFFFFF,WhiteSmoke,#F5F5F5Yellow,#FFFF00,YellowGreen,#9ACD32,),)"}
        System.out.println("1 for hex to RGB and name or 2 for RGB to hex and nameor 3 for a name to hex and RGB: ");
        int i;
        try{
            i = input.nextInt();
        }
        catch(ArithmeticException e){
            System.out.println("can you read?");
            return;
        }
        System.out.println("Put in your hex or rgb or name string: ");
        String s = input.next();
        if(i == 1){ // hex to rest

        }
        else if(i ==2){ // RGB to rest

        }
        else if(i == 3){ // name to rest

        }
        else{
            System.out.println("can you read?");
            return;
        }
    }
}

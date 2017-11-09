package com.example.mylibrarydemo.utils.view;

public class CustomViewUtils {

    public static String setFont(int textFont,boolean isInEditMode) {
        String textFontType = null;
        if (!isInEditMode) {
            switch (textFont) {
                case 1:
                    textFontType = "avenir_black.otf";
                    break;
                case 2:
                    textFontType = "avenir_book.otf";
                    break;
                case 3:
                    textFontType = "avenir_heavy.otf";
                    break;
                case 4:
                    textFontType = "avenir_light.otf";
                    break;
                case 5:
                    textFontType = "avenir_medium.otf";
                    break;
                default:
                    textFontType = "avenir_light.otf";
                    break;
            }

        }
        return textFontType;

    }
}
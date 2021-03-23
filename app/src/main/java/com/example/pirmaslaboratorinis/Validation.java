package com.example.pirmaslaboratorinis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static final String USERNAME_REGEX_PATTERN = "^[a-zA-Z0-9]{3,20}$";
    public static final String EMAIL_REGEX_PATTERN = "^[a-zA-Z0-9@._-]{10,50}$";
    public static final String PASSWORD_REGEX_PATTERN = "^[a-zA-Z0-9@._]{5,20}$";


    public static boolean isUsernameValid(String username) {
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);//SUKURIAMOS USERNAME VALIDACIJAI TAISYKLES, PAGAL NURODYTA SABLONA
        Matcher matcher = pattern.matcher(username); //pagal anksciau sukurtas taisykles palyginimi vartotojo ivesti duomenys(username);//jeigu atitinka-grazins true, jei ne-false
        boolean isUsernameValid = matcher.find();//jeigu atitinka-grazins true, jei ne-false
        return isUsernameValid;
    }

    public static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);//SUKURIAMOS USERNAME VALIDACIJAI TAISYKLES, PAGAL NURODYTA SABLONA
        Matcher matcher = pattern.matcher(email); //pagal anksciau sukurtas taisykles palyginimi vartotojo ivesti duomenys(username);//jeigu atitinka-grazins true, jei ne-false
        boolean isEmailValid = matcher.find();//jeigu atitinka-grazins true, jei ne-false
        return isEmailValid;
    }

    public static boolean isPasswordValid(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX_PATTERN);//SUKURIAMOS USERNAME VALIDACIJAI TAISYKLES, PAGAL NURODYTA SABLONA
        Matcher matcher = pattern.matcher(password); //pagal anksciau sukurtas taisykles palyginimi vartotojo ivesti duomenys(username);//jeigu atitinka-grazins true, jei ne-false
        boolean isPasswordValid = matcher.find();//jeigu atitinka-grazins true, jei ne-false
        return isPasswordValid;
    }
}
       // private static boolean isCredentialsValid(String string, String regexPattern){








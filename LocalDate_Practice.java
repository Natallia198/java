package day28_DateTime;
/*
1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays */

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {
        String[] friends={"John","Aron","Natallia"};
        LocalDate JohnBirthday=LocalDate.of(2020,3,5);
        LocalDate AronBirthday=LocalDate.of(2000,10,12);
        LocalDate NatalliaBirthday=LocalDate.of(1984,06,19);

        LocalDate[] birthdays={JohnBirthday,AronBirthday,NatalliaBirthday};
       /* int a =100;
        int b=200;
        int c=300;
        int [] array1={a,b,c};*/
       for(int i=0; i<friends.length;i++){
           String name=friends[i];
           LocalDate bd=birthdays[i];
           System.out.println(name+"'s birthday is "+bd);
       }

    }
}


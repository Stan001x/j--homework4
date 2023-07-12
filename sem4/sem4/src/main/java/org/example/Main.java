package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> firstname = new ArrayList<String>();
        ArrayList<String> lastname = new ArrayList<String>();
        ArrayList<String> middlename = new ArrayList<String>();
        ArrayList<String> age = new ArrayList<String>();
        ArrayList<String> sex = new ArrayList<String>();
        ArrayList<Integer> id = new ArrayList<Integer>();

        while (true) {
            System.out.println("Введите фамилию: ");
            firstname.add(scanner.nextLine());
            if (firstname.get(firstname.size() -1).equals("exit")) {
                firstname.remove(firstname.size() -1);
                break;
               }

            System.out.println("Введите имя: ");
            lastname.add(scanner.nextLine());
            if (lastname.get(lastname.size() -1).equals("exit")) {
                lastname.remove(lastname.size() -1);
                break;
            }

            System.out.println("Введите отчество: ");
            middlename.add(scanner.nextLine());
            if (middlename.get(middlename.size() -1).equals("exit")) {
                middlename.remove(middlename.size() -1);
                break;
            }

            System.out.println("Введите возраст: ");
            age.add(scanner.nextLine());
            if (age.get(age.size() -1).equals("exit")) {
                age.remove(age.size() -1);
                break;
            }

            System.out.println("Введите пол: ");
            sex.add(scanner.nextLine());
            if (sex.get(sex.size() -1).equals("exit")) {
                sex.remove(sex.size() -1);
                break;
            }

            id.add(sex.size() - 1);}


        printList(firstname, lastname, middlename, age, sex, id);
        bubbleSort(age, id);
        printList(firstname, lastname, middlename, age, sex, id);


    }

    public static void bubbleSort(ArrayList<String> arrayList, ArrayList<Integer> idList){
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for(int j = 0; j < arrayList.size() - i - 1; j++) {
                if(Integer.parseInt(arrayList.get(j + 1)) < Integer.parseInt(arrayList.get(j))) {
                   // String swap = arrayList.get(j);
                    int idswap = idList.get(j);
                   // arrayList.set(j, arrayList.get(j+1));
                    idList.set(j, idList.get(j+1));
                  //  arrayList.set(j+1, swap);
                    idList.set(j+1, idswap);
                }
            }
        }
    }

    public static void printList(ArrayList<String> arrayList1, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5, ArrayList<Integer> arrayList6){
        for (int i = 0; i < arrayList6.size(); i++)
            System.out.println(arrayList1.get(arrayList6.get(i)) + " " + arrayList2.get(arrayList6.get(i)) + " " + arrayList3.get(arrayList6.get(i)) + " " + arrayList4.get(arrayList6.get(i)) + " " + arrayList5.get(arrayList6.get(i)));
    }

        }


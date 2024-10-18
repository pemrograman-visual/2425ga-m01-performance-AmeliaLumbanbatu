// 12S24025 - Paula Gevriella Tambunan
// 12S24031 - Amelia Renata Lumbanbatu

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nilaiHuruf, kredit;
        double performa;
        double nilaiAngka;

        nilaiAngka = 0;
        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            int sKS;

            sKS = Integer.parseInt(kredit);
            nilaiHuruf = input.nextLine();
            if (nilaiHuruf.equals("A")) {
                nilaiAngka = 4.0;
            } else {
                if (nilaiHuruf.equals("AB")) {
                    nilaiAngka = 3.5;
                } else {
                    if (nilaiHuruf.equals("B")) {
                        nilaiAngka = 3.0;
                    } else {
                        if (nilaiHuruf.equals("BC")) {
                            nilaiAngka = 2.5;
                        } else {
                            if (nilaiHuruf.equals("C")) {
                                nilaiAngka = 2.0;
                            } else {
                                if (nilaiHuruf.equals("D")) {
                                    nilaiAngka = 1.0;
                                } else {
                                    if (nilaiHuruf.equals("E")) {
                                        nilaiAngka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = sKS * nilaiAngka;
            System.out.println(performa);
            kredit = input.nextLine();
        }
    }
}

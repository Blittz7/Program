/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testy;

public class Materialy {

    int folia_mon = 5;
    int folia_pol = 20;
    int ww300 = 25;
    int OWV = 10;
    int Rollup = 10;
    int baner_lam = 5;
    int baner_powl = 8;
    int folia_3M = 50;
    int pap_130g = 5;

    int lam_mon = 5;
    int lam_pol = 15;
    int lam_3M = 50;

    int nac = 10;

    int len;
    int wid;
    int area;
    int list;
    int list2;

    public Materialy() {

    }

    public Materialy(int folia_mon, int folia_pol, int ww300, int OWV, int Rollup, int baner_lam, int baner_powl, int folia_3M, int pap_130g, int lam_mon, int lam_pol, int lam_3M) {
        this.folia_mon = folia_mon;
        this.folia_pol = folia_pol;
        this.ww300 = ww300;
        this.OWV = OWV;
        this.Rollup = Rollup;
        this.baner_lam = baner_lam;
        this.baner_powl = baner_lam;
        this.folia_3M = folia_3M;
        this.pap_130g = pap_130g;
        this.lam_mon = lam_mon;
        this.lam_pol = lam_pol;
        this.lam_3M = lam_3M;

    }
    int[] mat = {folia_mon, folia_pol, ww300, OWV, Rollup, baner_lam, baner_powl, folia_3M, pap_130g};
    int[] lam = {lam_mon, lam_pol, lam_3M};

    public int getArea(int wid, int len) {

        return area = wid * len;
    }

    public void materialy() {
        System.out.println("1. Folia monomerowa");
        System.out.println("2. Folia polimerowa");
        System.out.println("3. Folia WW300");
        System.out.println("4. Folia OWV");
        System.out.println("5. Rollup");
        System.out.println("6. Baner laminowany");
        System.out.println("7. Baner powlekany");
        System.out.println("8. Folia wylewana 3M");
    }

    public int mat(int list) {
        return area * mat[list - 1];
    }

    public void laminaty() {
        System.out.println("1. Laminat monomerowy");
        System.out.println("2. Laminat polimerowy");
        System.out.println("3. Laminat wylewany 3m");

    }

    public int matLam(int list, int list2) {
        return area * (mat[list - 1] + lam[list2 - 1]);
    }

    public int matLamNac(int list, int list2) {
        return area * (mat[list - 1] + lam[list2 - 1] + nac);
    }

    public int matNac(int list) {
        return area * (mat[list - 1] + nac);
    }

}

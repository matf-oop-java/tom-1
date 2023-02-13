package rs.math.oop.g02.p04.objektnoNzdNzs;

class CeoBroj {
    // вредноcт датог целог броја
    int vrednost;

    // конcтруктор
    CeoBroj(int vrednostBroja) {
        vrednost = vrednostBroja;
    }
    // метод за приказ целог броја
    void prikazi() {
        System.out.print(vrednost);
        System.out.println();
    }
    // одређивање НЗД датог броја и другог целог броја
    CeoBroj NZD(CeoBroj drugi) {
        int prvaVrednost = vrednost;
        int drugaVrednost = drugi.vrednost;
        while (drugaVrednost > 0) {
        	// ако је први већи, доћи ће до напретка
        	// у супротном ће бројеви разменити места па ће у наредној итерацији доћи до напретка
        	int ostatak = prvaVrednost % drugaVrednost;
        	prvaVrednost = drugaVrednost;
        	drugaVrednost = ostatak;
        }
        return new CeoBroj(prvaVrednost);
    }
    // одређивање НЗС датог броја и другог целог броја
    CeoBroj NZS(CeoBroj drugi) {
        CeoBroj nzd = this.NZD(drugi);
        int nzs = vrednost / nzd.vrednost * drugi.vrednost;
        return new CeoBroj(nzs);
    }
}

/**
 * Latihan44
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Hukum OHM
 */
class Baterai{
    private float kuatArus, hambatan;
    
    public Baterai () {
        System.out.println("=====Hukum Ohm=====");
    }
    
    public Baterai (float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
        
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n"
                + "akan berbanding lurus dengan beda potensial\n"
                + "pada ujung-ujung kawat penghantar tersebut\n"
                + "asalkan suhu kawat dijaga konstan.");
    }
    
    public float getKuatArus () {
        return kuatArus;
    }
    
    public float getHambatan () {
        return hambatan;
    }
    
    public float hitungTegangan () {
        return kuatArus * hambatan;
    }
}

    
    


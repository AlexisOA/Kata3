/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author Usuario
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
    
    
}




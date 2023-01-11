public class Report4_3 {
    public static void main(String args[]) {

        for (int a = 9; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        for (int e = 0; e <= 9; e++) {
                            for (int f = 1; f <= 9; f++) {
                                for (int g = 0; g <= 9; g++) {
                                    for (int h = 0; h <= 9; h++) {
                                        for (int i = 0; i <= 9; i++) {
                                            for (int j = 0; j <= 9; j++) {
                                                for (int k = 1; k <= 9; k++) {
                                                    long sahen1 = 10000 * a + 1000 * b + 100 * c + 10 * d + e;
                                                    long sahen2 = 10000 * f + 1000 * g + 100 * h + 10 * i + k;
                                                    long uhen = sahen1 * sahen2;
                                                    if(sahen1*sahen2 < 10000000000L && sahen1 * sahen2 > 1000000000){
                                                        if( ){ 
                                                            System.out.println(sahen1 + "*" + sahen2 + "=" + sahen1 * sahen2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
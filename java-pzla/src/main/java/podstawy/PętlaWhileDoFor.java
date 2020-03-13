package podstawy;

public class PętlaWhileDoFor {
    public static void main(String[] args) {
        //While - sprawdz
        // int i = 5;
        // while (i > 0) {   //to jest nic innego jak funkcja logiczna true/false
        //     System.out.println(i);
        //     i--;    //UWAGA: musimy zakończyć pętle, bo będzie się robić w nieskończoność// wyświetla 5,4,3,2,1
        //   }
        //   System.out.println(i); // poprzez e zapis pętla wykona się jeszcze raz  o 1 w dół i wyniesie 5,4,3,2,1,0
        //  }
        //  }

// Pętla Do - zrób

        //     int i = 5;
        //     do {
        //         System.out.println(i);
        //        i--;                        // zapobiegamy tym zapisem nieskończoności wykonywania petli
        //     } while (i > 0); //5,4,3,2,1    // w tym miejscu while ma jako jedyna ; zamiast {
        //    System.out.println(i);          // poprzez ten zapis petla wykona się jeszcze raz da wynik 5,4,3,2,1,0
        //}
//}
//  Pętla for - przez (przejdz przez te wartości)
//  I metoda
        //   for(int i = 5; i > 0; i--){
        //      System.out.println(i);   // wynik 5,4,3,2,1
        //  }
//}
        //  }
        //  Metoda II
      //  int i = 5;
       // for (; i > 0; i--) {
       //     System.out.println(i);
       // }
        //    System.out.println(i);   // wynik 5,4,3,2,1,0
   // }
//}

// przykład rozbudowany

    for (int i = 5; i > 0 && true; i--){    // i=5 wskazuje, że petla wykona sie 5 razy
        System.out.println(i); // wynik 5,4,3,2,1
    }
    }
    }
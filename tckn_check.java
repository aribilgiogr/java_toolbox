 //Kimlik Kontrolü
        System.out.print("Kimlik Giriniz:");
        long tckn = scanner.nextLong();
        if (String.valueOf(tckn).length() == 11) {
            long ilk9 = tckn / 100;
            long son2 = tckn % 100;
            long b = 9, tekler = 0, ciftler = 0;
//            while (ilk9 > 0 && b > 0) {
//                if (b % 2 == 0) {
//                    ciftler += ilk9 % 10;
//                } else {
//                    tekler += ilk9 % 10;
//                }
//                ilk9 /= 10;
//                b--;
//            }
            for (int j = 9; ilk9 > 0 && j > 0; j--) {
                if (j % 2 == 0) {
                    ciftler += ilk9 % 10;
                } else {
                    tekler += ilk9 % 10;
                }
                ilk9 /= 10;
            }
            long b10 = (tekler * 7 - ciftler) % 10;
            long b11 = (tekler + ciftler + b10) % 10;
            if (son2 == b10 * 10 + b11) {
                System.out.println("Tutarlı.");
            } else {
                System.out.println("Tutarsız.");
            }
        }

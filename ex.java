import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int PIN = 1234;
        double mypin;
        double options;
        long number;
        long money;
        double dooro;
        double option;

        System.out.println("Dial EVC plus");
        String dial = input.next();
        String DialEVC = "*770#";

        if (dial.equals(DialEVC)) {
            System.out.println("-EVCPLUS-");
            System.out.println("Fadlan geli PIN-kaaga");
            mypin = input.nextDouble();
            System.out.println("EVC-PLUS");

            //0= qeybta hubinta pinka
            int MiFiuser;
            long haraa = 100;
            double select;

            if (mypin == PIN) {
                System.out.println("1.Itus haraagaaga");
                System.out.println("2.Kaarka hadalka");
                System.out.println("3.Bixi Biil");
                System.out.println("4.U wareeji EVCPLUS");
                System.out.println("5.Warbixin Kooban");
                System.out.println("6.Salaam Bank");
                System.out.println("7.Maareynta");
                System.out.println("8.Bill Payment");

                options = input.nextDouble();

                // 1=qeybta fiirinta haraaga
                if (options == 1) {
                    System.out.println("Haraagaagu Waa " + haraa + "$");
                }

                // 2=qeybta kaarka hadalka
                if (options == 2) {
                    System.out.println("Kaarka Hadalka");
                    System.out.println("1.ku shubo Airtime");
                    System.out.println("2.Ugu shub Airtime");
                    System.out.println("3.MIFI Packages");
                    System.out.println("4.Ku shubo Internet");
                    System.out.println("5.Ugu shub qof kale (MMT)");

                    option = input.nextDouble();

                    if (option == 1) {
                        System.out.println("Fadlan Geli Lacagta");
                        money = input.nextLong();
                        System.out.println("Ma hubtaa inaad $" + money + " ugu shubtid un-deffined?");
                        System.out.println("1.Haa");
                        System.out.println("2.Maya");
                        select = input.nextDouble();

                        if (select == 1) {
                            System.out.println("Waxaad ku shubatay $" + money + " Haraagaagu waa " + (haraa - money));
                        } else {
                            System.out.println("Waad ku mahadsantahay iska joojinta adeegaan");
                        }
                    }

                    if (option == 2) {
                        System.out.println("soogali Mobile-ka");
                        number = input.nextLong();
                        System.out.println("soo gali lacag");
                        money = input.nextLong();
                        System.out.println("Ma hubtaa inaad \n$" + money + " ugu shubeesid\nnumberka" + number + "?");
                        System.out.println("1.Haa");
                        System.out.println("2.Maya");
                        dooro = input.nextDouble();

                        if (dooro == 1) {
                            System.out.println("Waxaad $" + money + " ugu shubtay \n" + number + "\nharaagaagu waa $" + (haraa - money));
                        } else {
                            System.out.println("Waad ku mahadsantahay iska joojinta adeegaan");
                        }
                    }

                    if (option == 3) {
                        System.out.println("EVCPlus");
                        System.out.println("1.Ku shubo Data-da MIFI");
                        dooro = input.nextDouble();

                        if (dooro == 1) {
                            System.out.println("-- internet Bundle Recharge --");
                            System.out.println("1.Isbuucle(Weekly)");
                            System.out.println("2.Bille(MiFI)");
                            System.out.println("3.Maalinle(Daily)");

                            dooro = input.nextDouble();

                            if (dooro == 1) {
                                System.out.println("Fadlan dooro Bandle Week");
                                System.out.println("1.$5=10GB");
                                System.out.println("2.$10=25GB");

                                dooro = input.nextDouble();

                                if (dooro == 1) {
                                    System.out.println("Fadlan GelI MiFi user");
                                    MiFiuser = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $5 ugu shubtid " + MiFiuser + "?");
                                    System.out.println("1.Haa");
                                    System.out.println("2.Maya");
                                    dooro = input.nextDouble();

                                    if (dooro == 1) {
                                        System.out.println("waxaad $5 ugu shubtay " + MiFiuser);
                                    } else {
                                        System.out.println("waad ku mahadsantahay inaad iska joojiso adeegaan");
                                    }
                                }

                                if (dooro == 2) {
                                    System.out.println("Fadlan GelI MiFi user");
                                    MiFiuser = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $10 ugu shubtid " + MiFiuser + "?");
                                    System.out.println("1.Haa");
                                    System.out.println("2.Maya");
                                    dooro = input.nextDouble();

                                    if (dooro == 1) {
                                        System.out.println("waxaad $10 ugu shubtay " + MiFiuser);
                                    } else {
                                        System.out.println("waad ku mahadsantahay inaad\n iska joojiso adeegaan");
                                    }
                                }
                            }

                            if (dooro == 2) {
                                System.out.println("Fadlan dooro bundle ka ");
                                System.out.println("1. $20 = 40 GB");
                                System.out.println("2. $40 = 85 GB");
                                System.out.println("3. $60 = 150 GB");
                                System.out.println("4. $30 = Monthly Unlimit");

                                dooro = input.nextDouble();

                                if (dooro == 1) {
                                    System.out.println("Fadlan Gali MIFI user");
                                    MiFiuser = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $20 ugu shubtid " + MiFiuser + "?");
                                    System.out.println("1.Haa");
                                    System.out.println("2.Maya");
                                    dooro = input.nextDouble();

                                    if (dooro == 1) {
                                        System.out.println("waxaad 20$ ugu shubtay " + MiFiuser);
                                    } else {
                                        System.out.println("waad ku mahadsantahay inaad iska joojisay adeegaan");
                                    }
                                }
                            }
                        }
                    }
                }

                // 3= QEYBTA BIXI BILLKA
                double aqoonsi;
                double bill = 100;
                double haaye;

                if (options == 3) {
                    System.out.println("Bixi Bill");
                    System.out.println("1.Post Paid");
                    System.out.println("2.Ku iibso");
                    dooro = input.nextDouble();

                    if (dooro == 1) {
                        System.out.println("post paid\n1.Ogow biilka\n2.bixi biil\n3.ka bixi biil");
                        dooro = input.nextInt();

                        if (dooro == 1) {
                            System.out.println("Haraagaa biilka waa $" + bill);
                        }

                        if (dooro == 2) {
                            System.out.println("fadlan aqoonsiga soo gali");
                            aqoonsi = input.nextDouble();
                            System.out.println("Fadlan Geli Number ka");
                            number = input.nextInt();
                            System.out.println("Fadlan Gali lacagta");
                            money = input.nextLong();

                            if (money <= bill) {
                                System.out.println("Ma hubtaa inaad " + money + " udirto " + number + "\n1.haa\n2.maya");
                                dooro = input.nextInt();

                                if (dooro == 1) {
                                    haaye = bill - money;
                                    System.out.println("waad ku guuleystay howshaan\nHaraagaagu waa " + haaye);
                                } else {
                                    System.out.println("Mahadsanid!");
                                }
                            }
                        }
                    }
                }

                // 4=qeybta wareejinta lacagta
                if (options == 4) {
                    System.out.println("Fadlan Geli Mobile-ka");
                    number = input.nextLong();
                    System.out.println("Fadlan soo gali lacagta");
                    money = input.nextLong();
                    System.out.println("Ma hubtaa in aad " + money + "$ u wareejineesid " + number + "?");
                    System.out.println("1.haa");
                    System.out.println("2.maya");
                    dooro = input.nextDouble();

                    if (dooro == 1) {
                        System.out.println("[-EVCPlus-]$" + money + "\n ayaad uwareejisay " + number +
                                "\n Haraagaaga EVCPLUS Waa $" + (haraa - money) +
                                ".\n.20 sano oo adeeg bulsho ah");
                    } else {
                        System.out.println("Waad Ku guuleesatay inaad iska joojiso adeegaan");
                    }
                }

                // 5=qeybta warbixin kooban
                String gmail;
                int date;

                if (options == 5) {
                    System.out.println("Warbixin kooban");
                    System.out.println("1.Last Action");
                    System.out.println("2.Wareejintii udambeesay");
                    System.out.println("3.Iibsashadii udambeesay");
                    System.out.println("4.last 3 actions");
                    System.out.println("5.Email me my activity");

                    option = input.nextDouble();

                    if (option == 1) {
                        System.out.println("$20 ayaad uwareejisay +2526000000");
                    }

                    if (option == 2) {
                        System.out.println("statementiga :");
                        System.out.println("1.Udirtay");
                        System.out.println("2.Ka heshay");
                        dooro = input.nextDouble();

                        if (dooro == 1) {
                            System.out.println("Soo Gali Numberka");
                            number = input.nextLong();
                            System.out.println("waan ka xunahay wax lacag ah uma aadan dirin " + number);
                        }

                        if (dooro == 2) {
                            System.out.println("Soo Gali Numberka");
                            number = input.nextLong();
                            System.out.println("waan ka xunnahay wax lacag ah kuuma uusan soo dirin " + number);
                        }
                    }

                    if (option == 3) {
                        System.out.println("Fadlan geli aqoonsiga ganacsiga");
                        aqoonsi = input.nextDouble();
                        System.out.println("no paying options");
                    }

                    if (option == 4) {
                        System.out.println("your mini statement has been sent as sms to your registered mobile no");
                    }

                    if (option == 5) {
                        input.nextLine(); // Consume newline
                        System.out.println("Fadlan soo gali Gmail kaaga ");
                        gmail = input.nextLine();
                        System.out.println("soo gali date ka dabe (maalin/bisha/sanadka) sida 30/10/2019");
                        date = input.nextInt();
                        System.out.println("you request is been processed and the activity will be emailed to " + gmail);
                    }
                }

                // 6= QEYBTA SALAAM BANK
                if (options == 6) {
                    System.out.println("Salaam Bank");
                    System.out.println("1.Itus Haraagaaga");
                    System.out.println("2.Lacag Dhigasho");
                    System.out.println("3.Lacag Qaadahso");
                    System.out.println("4.Ka wareeji EVCP-lus");
                    System.out.println("5.uwareeji Account to Account");
                    System.out.println("6.Maaraynta Bank-ga");
                    System.out.println("7.Kala bax");

                    int SalaamBank_Options = input.nextInt();
                    int Bank_PIN_Number = 1234;
                    int Bank_Number = 2299330;
                    double Bank_Balance = 6000;
                    String Bank_Account_Holder = "maxamed cabdiraxin axmed";

                    //Itus Haragaga
                    if (SalaamBank_Options == 1) {
                        System.out.println("Fadlan Geli Number-kaga sirta ee Bank-ga");
                        int Bank_PIN_Code = input.nextInt();

                        if (Bank_PIN_Code == Bank_PIN_Number) {
                            System.out.println("Koontada Bank-ga:" + Bank_Number + " " + Bank_Account_Holder +
                                    " Haraagaagu waa $" + Bank_Balance + " USD");
                        } else {
                            System.out.println("Incorrect Bank Password");
                        }
                    }
                    //Lacag Dhigasho
                    else if (SalaamBank_Options == 2) {
                        System.out.println("Fadlan Geli Lacagta: ");
                        double LacagDhigasho = input.nextDouble();
                        input.nextLine();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        String Maclumad = input.nextLine();
                        System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                        int Bank_PIN_Code = input.nextInt();

                        if (Bank_PIN_Code == Bank_PIN_Number) {
                            System.out.println("Ma hubtaa inaad $" + LacagDhigasho +
                                    " dhigatid Accountkaga Bank-ga? (1. Haa 2. Maya)");
                            int Bank_Dhigasho_Yes_Or_No = input.nextInt();

                            if (Bank_Dhigasho_Yes_Or_No == 1) {
                                double NewBalance = LacagDhigasho + Bank_Balance;
                                System.out.println("Waxaad ku guuleysatay inaad $" + LacagDhigasho +
                                        " dhigatid Bank-kaga " + Bank_Number +
                                        " Haraagaagu cusub ee koontada waa $" + NewBalance);
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        }
                    }
                    // Lacag Qaadahso
                    else if (SalaamBank_Options == 3) {
                        System.out.println("Fadlan Soo Geli Lacagta:");
                        double Lacag_Qaadasho = input.nextDouble();
                        input.nextLine();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        String Qadasho_Maclumad = input.nextLine();
                        System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                        int Bank_PIN_Code = input.nextInt();

                        if (Bank_PIN_Code == Bank_PIN_Number) {
                            System.out.println("Ma hubtaa inaad $" + Lacag_Qaadasho +
                                    " ka qaadatid Account kaga Bank-ga? (1. Haa 2. Maya)");
                            int Bank_Qaadasho_Yes_Or_No = input.nextInt();
                            double newBalance = Bank_Balance - Lacag_Qaadasho;

                            if (Bank_Balance < Lacag_Qaadasho) {
                                System.out.println("Haraagaaga koontadu kuguma filna ");
                            } else {
                                if (Bank_Qaadasho_Yes_Or_No == 1) {
                                    System.out.println("Waxaad ku guuleysatay inaad $" + Lacag_Qaadasho +
                                            " Haraagaaga cusub ee koontadu waa $" + newBalance);
                                } else {
                                    System.out.println("Mahadsanid");
                                }
                            }
                        }
                    }
                    // Ka wareeji EVCP-lus
                    else if (SalaamBank_Options == 4) {
                        System.out.println("Ka wareeji EVCPlus: \n" +
                                "1. Salaam Somali Bank \n" +
                                "2. Salaam SCH \n" +
                                "3. Bank Beeraha \n" +
                                "4. Daarusalam Bank \n" +
                                "5. MyBank LTD");
                        int Ka_Wareeji_Options = input.nextInt();

                        if (Ka_Wareeji_Options >= 1 && Ka_Wareeji_Options <= 5) {
                            System.out.println("Fadlan Geli Account-kaga ");
                            int Account_Number = input.nextInt();
                            input.nextLine(); // Consume newline
                            System.out.println("Fadlan Geli Macluumaad: ");
                            String Maclumad = input.nextLine();
                            System.out.println("Invalid");
                        } else {
                            System.out.println("Selection Error: Fadlan Dooro Numberska (1 - 5)");
                        }
                    }
                    // Account to Account
                    else if (SalaamBank_Options == 5) {
                        System.out.println("Account to Account: ");
                        System.out.println("Fadlan Geli Account ama Mobile Number: ");
                        int Account_Mobile = input.nextInt();
                        System.out.println("Fadlan Geli Lacagta: ");
                        double Lacagta_Account = input.nextDouble();
                        input.nextLine(); // Consume newline
                        System.out.println("Fadlan Geli Macluumaad: ");
                        String Maclumad = input.nextLine();
                        System.out.println("Fadlan Geli Number-ka sirta ah: ");
                        int BankPINCode = input.nextInt();

                        if (Bank_PIN_Number == BankPINCode) {
                            System.out.println("Ma hubtaa inaad $" + Lacagta_Account +
                                    " u wareejisid Account Number-ka " + Account_Mobile +
                                    " (1. Haa 2. Maya)");
                            int Account_Warejin_Yes_Or_No = input.nextInt();

                            if (Account_Warejin_Yes_Or_No == 1) {
                                System.out.println("Waxaad ku guuleysatay inaad $" + Lacagta_Account +
                                        " u wareejisid koontada " + Account_Mobile + " Mahadsanid!");
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        } else {
                            System.out.println("Incorrect PIN Code");
                        }
                    }
                    // Maaraynta Bank-ga
                    else if (SalaamBank_Options == 6) {
                        System.out.println("Fadlan Geli On-Time-Password-ga");
                        int OnTimePassword = input.nextInt();
                        System.out.println("Invalid");
                    }
                    // ka bax
                    else if (SalaamBank_Options == 7) {
                        System.out.println("Maareynta Bank-ga: \n" +
                                "1. Bedel PIN-ka Bank-ga \n" +
                                "2. Bedel Password-ka E-Bank-ga");
                        int Maareynta_Bankga = input.nextInt();

                        if (Maareynta_Bankga == 1) {
                            System.out.println("Fadlan Geli PIN-kaaga Cusub ee koontada:");
                            int NewBank_PIN_Code = input.nextInt();
                            System.out.println("Ku celi PINkaga cusub ee koontada");
                            int Confirm_PIN_Code = input.nextInt();

                            if (NewBank_PIN_Code == Confirm_PIN_Code) {
                                System.out.println("Waxaad ku guuleysatay inaad badasho binkkaga sirta ah ee koontada");
                            } else {
                                System.out.println("Confirm Password Not Matching");
                            }
                        } else if (Maareynta_Bankga == 2) {
                            System.out.println("Fadlan Geli PIN-ka Cusub ee koontada E-Bank:");
                            int NewE_Bank_PIN_Code = input.nextInt();
                            System.out.println("Ku celi PIN ka cusub ee koontada");
                            int Confirm_PIN_Code = input.nextInt();

                            if (NewE_Bank_PIN_Code == Confirm_PIN_Code) {
                                System.out.println("Waxaad ku guuleysatay inaad badasho bin kaga sirta ee koontada E-Bank:");
                            } else {
                                System.out.println("Confirm Password Not Matching");
                            }
                        }
                    } else {
                        System.out.println("Selection Error: Fadlan Dooro (1 - 7)");
                    }
                }

                // 7=qeybta maareynta
                int newpin;
                int Aqoonsigalacag_dirida;
                long wrong_num;
                int macluumaad;
                int confirm;

                if (options == 7) {
                    System.out.println("Maareynta");
                    System.out.println("1.Bedel lambarka sirta");
                    System.out.println("2.Bedel Luuqada");
                    System.out.println("3.Wargali Mobile Lumay");
                    System.out.println("4.Lacag Xirasho");
                    System.out.println("5.Uceli Lacag Qaldantay");
                    System.out.println("6.EnableMobileBanking");

                    dooro = input.nextDouble();

                    if (dooro == 1) {
                        System.out.println("Fadlan Geli PIN-kaaga cusub ");
                        newpin = input.nextInt();
                        System.out.println("Fadlan Hubi PIN-kaaga cusub");
                        confirm = input.nextInt();

                        if (newpin == confirm) {
                            System.out.println("waad ku guuleesatay inaad iska badasho pinka");
                        }
                    }

                    if (dooro == 2) {
                        System.out.println("Fadlan dooro Luuqada");
                        System.out.println("1. SOMALI");
                        System.out.println("2. ENGLISH");

                        dooro = input.nextDouble();

                        if (dooro == 1) {
                            System.out.println("waad ku guuleesatay inaad iska badashay luuqada");
                        } else if (dooro == 2) {
                            System.out.println("congrats you win to change your language");
                        }
                    }

                    if (dooro == 3) {
                        System.out.println("Fadlan Geli Mobile ka lumay");
                        number = input.nextLong();
                        System.out.println("waxaa lagu war gelinayaa in numberkaan\n" + number +
                                " uu yahay mid udiiwaan\ngashay lumitaaan ?");
                    }

                    if (dooro == 4) {
                        System.out.println("Fadlan Geli Numberka Khaladka ah");
                        wrong_num = input.nextLong();
                        System.out.println("Fadlan Geli Numberkii Loo rabay ");
                        number = input.nextLong();
                        System.out.println("Fadlan Geli Macluumaad");
                        macluumaad = input.nextInt();

                        if (macluumaad == 1) {
                            System.out.println("Ma hubtaa in aad xirto lacagtaan ");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                        }
                    }

                    if (dooro == 5) {
                        System.out.println("Fadlan Geli Aqoonsiga Lacag Dirida");
                        Aqoonsigalacag_dirida = input.nextInt();
                        System.out.println("waad KU mahadsantahay");
                    }

                    if (dooro == 6) {
                        System.out.println("fadlan Geli NUMBERKA is-DIIWAAAN gelinta");
                        number = input.nextLong();
                    }
                }

                // 8= BILL PAYMENTS
                if (options == 8) {
                    handleBillPayment(input, haraa);
                }
                } else {
                    System.out.println("<-EVCPLUS-> lambarka sirta ah waa qalad");
                }
                } else {
                    System.out.println("Sorry, the operation failed due to the invalid message format.");
                }
                }
                private static final String[] BILL_PAYMENT_MENU = {
                        "1.Itus Haraaga Bill ka",
                        "2.Wada bixi Bill ka",
                        "3.Qayb Ka Bixi Bill ka"
                };

                private static final String[] BILL_TYPES = {
                        "Electricity",
                        "Water",
                        "Internet",
                        "TV Subscription"
                };

                    private static void handleBillPayment(Scanner input, long balance) {
                        printBillPaymentMenu();
                        int opt = input.nextInt();

                        switch(opt) {
                            case 1:
                            checkBillBalance(input);
                            break;
                        case 2:
                            payFullBill(input);
                            break;
                        case 3:
                            payPartialBill(input, balance);
                            break;
                        default:
                            System.out.println("Invalid option selected");
                    }
                }

                private static void printBillPaymentMenu() {
                    System.out.println("EVCPlus");
                    for (String option : BILL_PAYMENT_MENU) {
                        System.out.println(option);
                    }
                }



                // ITUS HARAAGA BILL KA
                private static void checkBillBalance(Scanner input) {
                    System.out.println("Fadlan gali bill reference number");
                    String reference = input.next();
                    System.out.println("Fadlan dooro nooca biilka:");

                    for (int i = 0; i < BILL_TYPES.length; i++) {
                        System.out.println((i+1) + ". " + BILL_TYPES[i]);
                    }

                    int billType = input.nextInt();

                    if (billType > 0 && billType <= BILL_TYPES.length) {
                        System.out.println("Haraaga biilka " + BILL_TYPES[billType-1] +
                                " ee lambarka " + reference + " waa $100");
                    } else {
                        System.out.println("Invalid bill type selected");
                    }
                }


                // Wada bixi Bill ka
                private static void payFullBill(Scanner input) {
                    System.out.println("Fadlan gali bill reference number");
                    String reference = input.next();
                    System.out.println("Fadlan dooro nooca biilka:");

                    for (int i = 0; i < BILL_TYPES.length; i++) {
                        System.out.println((i+1) + ". " + BILL_TYPES[i]);
                    }

                    int billType = input.nextInt();

                    if (billType > 0 && billType <= BILL_TYPES.length) {
                        System.out.println("Ma hubtaa inaad wada bixid biilka " +
                                BILL_TYPES[billType-1] + " ee $100?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");

                        int confirm = input.nextInt();

                        if (confirm == 1) {
                            System.out.println("Biilka ayaa loo bixiyay. Mahadsanid!");
                        } else {
                            System.out.println("Bixinta biilka waa la joojiyay");
                        }
                    } else {
                        System.out.println("Invalid bill type selected");
                    }
                }


                // QAYB KA BIXI BILL KA
                private static void payPartialBill(Scanner input, long balance) {
                    System.out.println("Fadlan gali bill reference number");
                    String reference = input.next();
                    System.out.println("Fadlan dooro nooca biilka:");

                    for (int i = 0; i < BILL_TYPES.length; i++) {
                        System.out.println((i+1) + ". " + BILL_TYPES[i]);
                    }

                    int billType = input.nextInt();

                    if (billType > 0 && billType <= BILL_TYPES.length) {
                        System.out.println("Fadlan geli qadarka aad rabto inaad bixiso:");
                        double amount = input.nextDouble();

                        if (amount > balance) {
                            System.out.println("Haraagaagu kuguma filna. Haraagaagu waa $" + balance);
                            return;
                        }

                        System.out.println("Ma hubtaa inaad bixiso $" + amount +
                                " biilka " + BILL_TYPES[billType-1] + "?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");

                        int confirm = input.nextInt();

                        if (confirm == 1) {
                            System.out.println("Waxaad ku guuleysatay inaad bixiso $" +
                                    amount + " biilka " + BILL_TYPES[billType-1]);
                            System.out.println("Haraagaaga cusub waa $" + (balance - amount));
                        } else {
                            System.out.println("Bixinta biilka waa la joojiyay");
                        }
                    } else {
                        System.out.println("Invalid bill type selected");
                    }
    }
}
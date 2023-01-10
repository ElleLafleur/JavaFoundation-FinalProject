import java.util.HashMap;
import java.util.Scanner;


    public class MathJeopardy {

        static int playerOnePoints = 0;
        static int playerTwoPoints = 0;

        public static void main(String[] args) {

            doNext();

        }


        public static void doNext() {
            gameBoard();
            System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Quit game \nPlease select a category: ");
            Scanner category = new Scanner(System.in);
            int doNext = category.nextInt();
            switch (doNext) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    System.out.println("Player one points: " + playerOnePoints);
                    System.out.println("Player two points: " + playerTwoPoints);
                    if(playerOnePoints > playerTwoPoints)
                        System.out.println("Congratulations player one you are the winner!");
                    else if (playerOnePoints == playerTwoPoints)
                        System.out.println("Congratulations to both players its a tie!");
                    else
                        System.out.println("Congratulations player two you are the winner!");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    doNext();
            }
        }

        public static void addition() {
            System.out.println("Addition");
            System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
            Scanner addition = new Scanner(System.in);
            int add = addition.nextInt();
            switch (add) {
                case 1:
                    System.out.println("20 + 78 =  ");
                    Scanner Input1 = new Scanner(System.in);
                    double num = Input1.nextDouble();
                    if (num == 98) {
                        System.out.println("Correct!");
                        whichPlayer100();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 2:
                    System.out.println("55 + 16 =  ");
                    Scanner Input2 = new Scanner(System.in);
                    double num1 = Input2.nextDouble();
                    if (num1 == 71) {
                        System.out.println("Correct!");
                        whichPlayer200();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;

                case 3:
                    System.out.println("189 + 209 =  ");
                    Scanner Input3 = new Scanner(System.in);
                    double num2 = Input3.nextDouble();
                    if (num2 == 398) {
                        System.out.println("Correct!");
                        whichPlayer300();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 4:
                    System.out.println("307 + 1028 =  ");
                    Scanner Input4 = new Scanner(System.in);
                    double num3 = Input4.nextDouble();
                    if (num3 == 1335) {
                        System.out.println("Correct!");
                        whichPlayer400();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    addition();
                    break;
            }
            displayPoints();
            doNext();
        }

        public static void subtraction() {
            System.out.println("Subtraction");
            System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
            Scanner subtraction = new Scanner(System.in);
            int subtract = subtraction.nextInt();
            switch (subtract) {
                case 1:
                    System.out.println("82 - 10 =  ");
                    Scanner Input1 = new Scanner(System.in);
                    double num = Input1.nextDouble();
                    if (num == 72) {
                        System.out.println("Correct!");
                        whichPlayer100();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 2:
                    System.out.println("78 - 17 =  ");
                    Scanner Input2 = new Scanner(System.in);
                    double num1 = Input2.nextDouble();
                    if (num1 == 61) {
                        System.out.println("Correct!");
                        whichPlayer200();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;

                case 3:
                    System.out.println("283 - 37 =  ");
                    Scanner Input3 = new Scanner(System.in);
                    double num2 = Input3.nextDouble();
                    if (num2 == 246) {
                        System.out.println("Correct!");
                        whichPlayer300();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 4:
                    System.out.println("1853 + 357 =  ");
                    Scanner Input4 = new Scanner(System.in);
                    double num3 = Input4.nextDouble();
                    if (num3 == 1496) {
                        System.out.println("Correct!");
                        whichPlayer400();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    addition();
                    break;
            }
            displayPoints();
            doNext();
        }


        public static void multiplication() {
            System.out.println("Multiplication");
            System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
            Scanner multiplication = new Scanner(System.in);
            int multiply = multiplication.nextInt();
            switch (multiply) {
                case 1:
                    System.out.println("5 * 12 =  ");
                    Scanner Input1 = new Scanner(System.in);
                    double num = Input1.nextDouble();
                    if (num == 60) {
                        System.out.println("Correct!");
                        whichPlayer100();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 2:
                    System.out.println("12 * 8 =  ");
                    Scanner Input2 = new Scanner(System.in);
                    double num1 = Input2.nextDouble();
                    if (num1 == 96) {
                        System.out.println("Correct!");
                        whichPlayer200();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;

                case 3:
                    System.out.println("102 * 13 =  ");
                    Scanner Input3 = new Scanner(System.in);
                    double num2 = Input3.nextDouble();
                    if (num2 == 1326) {
                        System.out.println("Correct!");
                        whichPlayer300();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 4:
                    System.out.println("104 * 83 =  ");
                    Scanner Input4 = new Scanner(System.in);
                    double num3 = Input4.nextDouble();
                    if (num3 == 8632) {
                        System.out.println("Correct!");
                        whichPlayer400();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    addition();
                    break;
            }
            displayPoints();
            doNext();
        }

        public static void division() {
            System.out.println("Division");
            System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
            Scanner division = new Scanner(System.in);
            int divide = division.nextInt();
            switch (divide) {
                case 1:
                    System.out.println("88 / 8  =  ");
                    Scanner Input1 = new Scanner(System.in);
                    double num = Input1.nextDouble();
                    if (num == 11) {
                        System.out.println("Correct!");
                        whichPlayer100();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 2:
                    System.out.println("42 / 6 =  ");
                    Scanner Input2 = new Scanner(System.in);
                    double num1 = Input2.nextDouble();
                    if (num1 == 7) {
                        System.out.println("Correct!");
                        whichPlayer200();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;

                case 3:
                    System.out.println("108 / 9 =  ");
                    Scanner Input3 = new Scanner(System.in);
                    double num2 = Input3.nextDouble();
                    if (num2 == 12) {
                        System.out.println("Correct!");
                        whichPlayer300();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                case 4:
                    System.out.println("165 / 3 =  ");
                    Scanner Input4 = new Scanner(System.in);
                    double num3 = Input4.nextDouble();
                    if (num3 == 55) {
                        System.out.println("Correct!");
                        whichPlayer400();
                        break;
                    } else
                        System.out.println("Sorry that's incorrect");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    addition();
                    break;
            }
            displayPoints();
            doNext();
        }


        public static void add100PointsPlayer1() {
            playerOnePoints = playerOnePoints + 100;
            System.out.println("You have received 100 points player one!");
        }

        public static void add200PointsPlayer1() {
            playerOnePoints = playerOnePoints + 200;
            System.out.println("You have received 200 points player one!");
        }

        public static void add300PointsPlayer1() {
            playerOnePoints = playerOnePoints + 300;
            System.out.println("You have received 300 points player one!");
        }

        public static void add400PointsPlayer1() {
            playerOnePoints = playerOnePoints + 400;
            System.out.println("You have received 400 points player one!");
        }

        public static void add100PointsPlayer2() {
            playerTwoPoints = playerTwoPoints + 100;
            System.out.println("You have received 100 points player two!");
        }

        public static void add200PointsPlayer2() {
            playerTwoPoints = playerTwoPoints + 200;
            System.out.println("You have received 200 points player two!");
        }

        public static void add300PointsPlayer2() {
            playerTwoPoints = playerTwoPoints + 300;
            System.out.println("You have received 300 points player two!");
        }

        public static void add400PointsPlayer2() {
            playerTwoPoints = playerTwoPoints + 400;
            System.out.println("You have received 400 points player two!");
        }

        public static void whichPlayer100() {
            System.out.println("Is this player one or two?: ");
            Scanner player = new Scanner(System.in);
            String user = player.nextLine();
            if (user.toUpperCase().equals("ONE"))
                add100PointsPlayer1();
            else if (user.toUpperCase().equals("TWO"))
                add100PointsPlayer2();
            else {
                System.out.println("Please enter either one or two");
                whichPlayer100();

            }
        }

        public static void whichPlayer200() {
            System.out.println("Is this player one or two?: ");
            Scanner player = new Scanner(System.in);
            String user = player.nextLine();
            if (user.toUpperCase().equals("ONE"))
                add200PointsPlayer1();
            else if (user.toUpperCase().equals("TWO"))
                add200PointsPlayer2();
            else {
                System.out.println("Please enter either one or two");
                whichPlayer200();
            }
        }

        public static void whichPlayer300() {
            System.out.println("Is this player one or two?: ");
            Scanner player = new Scanner(System.in);
            String user = player.nextLine();
            if (user.toUpperCase().equals("ONE"))
                add300PointsPlayer1();
            else if (user.toUpperCase().equals("TWO"))
                add300PointsPlayer2();
            else {
                System.out.println("Please enter either one or two");
                whichPlayer300();

            }
        }

        public static void whichPlayer400() {
            System.out.println("Is this player one or two?: ");
            Scanner player = new Scanner(System.in);
            String user = player.nextLine();
            if (user.toUpperCase().equals("ONE"))
                add400PointsPlayer1();
            else if (user.toUpperCase().equals("TWO"))
                add400PointsPlayer2();
            else {
                System.out.println("Please enter either one or two");
                whichPlayer400();
            }
        }

        public static void displayPoints() {
            System.out.println("Player one points: " + playerOnePoints);
            System.out.println("Player two points: " + playerTwoPoints);
        }

        public static void player() {
            System.out.println("Please enter your name player 1: ");
            Scanner Input1 = new Scanner(System.in);
            String player1 = Input1.nextLine();

            System.out.println("Please enter your name player 2: ");
            Scanner Input2 = new Scanner(System.in);
            String player2 = Input2.nextLine();

        }

        public static void gameBoard(){

            int[] boardValues = new int[16];


            boardValues[0] = 100;
            boardValues[1] = 200;
            boardValues[2] = 300;
            boardValues[3] = 400;
            boardValues[4] = 100;
            boardValues[5] = 200;
            boardValues[6] = 300;
            boardValues[7] = 400;
            boardValues[8] = 100;
            boardValues[9] = 200;
            boardValues[10] = 300;
            boardValues[11] = 400;
            boardValues[12] = 100;
            boardValues[13] = 200;
            boardValues[14] = 300;
            boardValues[15] = 400;





            System.out.println("Addition " + "Subtraction " + "Multiplication " + "Division");
            System.out.println("  " + boardValues[0] + "        " + boardValues[4] + "         " + boardValues[8] + "          " + boardValues[12]);
            System.out.println("  " + boardValues[1] + "        " + boardValues[5] + "         " + boardValues[9] + "          " + boardValues[13]);
            System.out.println("  " + boardValues[2] + "        " + boardValues[6] + "         " + boardValues[10] + "          " + boardValues[14]);
            System.out.println("  " + boardValues[3] + "        " + boardValues[7] + "         " + boardValues[11] + "          " + boardValues[15]);


        }





    }





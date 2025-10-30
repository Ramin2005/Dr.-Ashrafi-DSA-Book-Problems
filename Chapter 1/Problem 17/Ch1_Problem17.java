
public class Ch1_Problem17 {

    public static int Calculator(String s, int x) {

        s = s.replace("x", x + "").replace(" ", "");

        System.out.println(s);

        // base case
        if (s == null || s.length() == 0) {
            return 0;
        }

        // base case
        if (!(s.contains("*") | s.contains("/") | s.contains("-") | s.contains("+"))) {
            return Integer.parseInt(s);

        } else {
            boolean outFlag = false;
            //pointer
            int i = 0;

            //first number
            char temp2 = s.charAt(i);
            String StringNum1 = "" + temp2;
            ++i;
            temp2 = s.charAt(i);

            while (Character.isDigit(temp2)) {
                StringNum1 = StringNum1 + temp2;
                ++i;
                temp2 = s.charAt(i);
            }

            //get second number
            String StringNum2 = "";
            ++i;
            char temp1 = s.charAt(i);

            do {
                StringNum2 = StringNum2 + temp1;
                ++i;
                if (i == s.length()) {
                    temp1 = 'E';
                    outFlag = true;
                } else {
                    temp1 = s.charAt(i);
                }
            } while (Character.isDigit(temp1));

            if (temp2 == '*' || temp2 == '/') {
                //* 
                if (temp2 == '*') {
                    int subResult = Integer.parseInt(StringNum1) * Integer.parseInt(StringNum2);
                    if (outFlag) {
                        s = subResult + "";
                    } else {
                        s = subResult + s.substring(i);
                    }
                    return Calculator(s, x);
                } //
                // /
                else {
                    int subResult = Integer.parseInt(StringNum1) / Integer.parseInt(StringNum2);
                    if (outFlag) {
                        s = subResult + "";
                    } else {
                        s = subResult + s.substring(i);
                    }
                    return Calculator(s, x);
                }
            } else {

                // +
                if (temp2 == '+') {
                    if (temp1 == '+' | temp1 == '-') {
                        int subResult = Integer.parseInt(StringNum1) + Integer.parseInt(StringNum2);
                        if (outFlag) {
                            s = subResult + "";
                        } else {
                            s = subResult + s.substring(i);
                        }
                        return Calculator(s, x);
                    } else if (temp1 == '*' | temp1 == '/') {

                        ++i;
                        String StringNum3 = "";
                        temp2 = s.charAt(i);

                        do {
                            StringNum3 = StringNum3 + temp2;
                            ++i;
                            if (i == s.length()) {
                                temp2 = 'E';
                                outFlag = true;
                            } else {
                                temp2 = s.charAt(i);
                            }
                        } while (Character.isDigit(temp2));

                        int subResult = 0;

                        if (temp1 == '*') {
                            subResult = Integer.parseInt(StringNum2) * Integer.parseInt(StringNum3);
                        } else {
                            subResult = Integer.parseInt(StringNum2) / Integer.parseInt(StringNum3);
                        }

                        if (outFlag) {

                            s = StringNum1 + "+" + subResult;
                        } else {
                            s = StringNum1 + "+" + subResult + s.substring(i);
                        }

                        return Calculator(s, x);
                    } else {
                        return Integer.parseInt(StringNum1) + Integer.parseInt(StringNum2);
                    }
                } // 
                // -
                else {
                    if (temp1 == '+' | temp1 == '-') {
                        int subResult = Integer.parseInt(StringNum1) - Integer.parseInt(StringNum2);
                        if (outFlag) {
                            s = subResult + "";
                        } else {
                            s = subResult + s.substring(i);
                        }
                        return Calculator(s, x);
                    } else if (temp1 == '*' | temp1 == '/') {

                        ++i;
                        String StringNum3 = "";
                        temp2 = s.charAt(i);

                        do {
                            StringNum3 = StringNum3 + temp2;
                            ++i;
                            if (i == s.length()) {
                                temp2 = 'E';
                                outFlag = true;
                            } else {
                                temp2 = s.charAt(i);
                            }
                        } while (Character.isDigit(temp2));

                        int subResult = 0;

                        if (temp1 == '*') {
                            subResult = Integer.parseInt(StringNum2) * Integer.parseInt(StringNum3);
                        } else {
                            subResult = Integer.parseInt(StringNum2) / Integer.parseInt(StringNum3);
                        }

                        if (outFlag) {

                            s = StringNum1 + "-" + subResult;
                        } else {
                            s = StringNum1 + "-" + subResult + s.substring(i);
                        }

                        return Calculator(s, x);
                    } else {
                        return Integer.parseInt(StringNum1) - Integer.parseInt(StringNum2);
                    }
                }
            }
        }
    }
}

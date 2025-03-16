public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500; //商品金額
        double num2 = 0.10; //税率
        int result;
        result = taxMethod(num1, num2); //税額
        System.out.println(num1 + "円の商品の税込価格は" + (num1+result) + "円（消費税は" + result + "円）です。"); //結果
    }

    //税額計算
    public static int taxMethod(int num1, double num2) {
        double num = num1 * num2;
        return (int) num;
    }
}
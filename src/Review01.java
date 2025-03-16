public class Review01 {

    public static void main(String[] args) {
     // 商品価格（例）
        int price = 1500;
     // 消費税率
        double Tax = 0.10;
     // 消費税額
        int TaxAmount = (int) (price*Tax);
     // 税込金額
        int totalPrice = (int) (price + TaxAmount);
     // 結果を表示
        System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + TaxAmount + "円）です。");
    }
}
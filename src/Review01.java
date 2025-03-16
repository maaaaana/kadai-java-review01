
public class Review01 {

    // 消費税率（変更があった場合、ここを修正するだけで対応可能）
    private static final double TAX_RATE = 0.10;

    public static void main(String[] args) {
        int price = 1500; // 商品価格（例）

        // taxメソッドを呼び出して消費税額を取得
        int taxAmount = tax(price);

        // 税込価格を計算
        int totalPrice = price + taxAmount;

        // 結果を表示
        System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。");
    }

    // 消費税額を計算するメソッド（小数点以下は切り捨て）
    public static int tax(int price) {
        return (int) (price * TAX_RATE);
    }
}

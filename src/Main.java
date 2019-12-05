
import bean.User;
import util.MenuUtil;
import util.UserUtil;

/*
0.login istedi oluşturulur, 3 defa yanlış girilirse hata vericek ve programdan çıkıcak
1.menü gelicek ve ne yapmak istediğimizi sorucak,"1-yarışmacıları dahil et, 2-yarışmaya başla 3- durumu öğren, 4-logut
2.yarışmacıları dahil et seçilir benden nasıl bir yarışmacı oluşturulacagı sorulur, yarışmacıların adı, soyadı, yaşı istenir
3.yarışmaya başla seçilir, sistem arka planda hazır bir index götürür ve benden hangi yarışmacının kazandığı bilgisini ister.
4.logout seçersem tekrar login sayfasına yönlendirir.
 */
public class Main {

    public static void main(String[] args) {
        User user = UserUtil.requireInputsAndLogin(3, true);
        System.out.println("Hello, " + user.getUsername());
        MenuUtil.showMenuInfinite();
    }
}

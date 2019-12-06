
import bean.User;
import util.MenuUtil;
import util.UserUtil;

/*
0.login istedi oluşturulur, 3 defa yanlış girilirse hata vericek ve programdan çıkıcak
Menü gelicek ve ne yapmak istediğimizi sorucak,"1-yarışmacıları dahil et, 2-yarışmaya başla 3- durumu öğren, 4-Yarışmacıların sayısını arttır, 5-Yarışmacılara bak, 6-Logout
1-yarışmacıları dahil et seçilir benden kaç yarışmacı eklemek istediğimi sorar, yarışmacıların adı, soyadı, yaşı istenir
2-yarışmaya başla seçilir, sistem arka planda hazır bir index götürür ve benden hangi yarışmacının kazandığı bilgisini ister.
3- durumu öğren dersek kaç puanımız olduğu bilgisini verir.
4-kaç yarışmacı ekleyeceğimi sorduktan sonra isim soyisim yaş bilgilerini ister.
5-bütün yarışmacıları ekrana getirir.
6-programdan çıkış yapar.
 */
public class Main {

    public static void main(String[] args) {
        User user = UserUtil.requireInputsAndLogin(3, true);
        System.out.println("Hello, " + user.getUsername());
        MenuUtil.showMenuInfinite();
    }
}

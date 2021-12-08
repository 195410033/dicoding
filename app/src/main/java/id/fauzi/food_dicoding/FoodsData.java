package id.fauzi.food_dicoding;

import java.util.ArrayList;

public class FoodsData {
    private static String[] foodNames = {
            "Nasi Goreng",
            "Nasi Ayam Hainan",
            "Nasi Uduk",
            "Mie Gacoan",
            "Mie Ayam",
            "Gado-Gado",
            "Gudeg",
            "Coto Makassar",
            "Kaledo",
            "Sate"
    };

    private static String[] foodDetails = {
            "Nasi goreng adalah komponen populer dari masakan Asia Timur, Tenggara dan Selatan pada wilayah tertentu. Sebagai hidangan buatan rumah, nasi goreng biasanya dibuat dengan bahan-bahan yang tersisa dari hidangan lainnya, yang berujung pada ragam yang tak terbatas.\nBahan :\n- 1 piring nasi putih\n- 1 btr telur, kocok lepas, buat orak-arik\n- 2 siung bawang putih, keprak, cincang\n- 1 btg daun bawang, iris tipis\n- 2 sdm kecap asin\n- Merica dan garam secukupnya\n- 2 sdm minyak goreng, untuk menumis.",
            "Nasi ayam Hainan adalah salah satu masakan khas Tionghoa yang sering disebut sebagai makanan tradisional Singapura.Nasi ayam Hainan adalah hidangan ayam rebus dan nasi berbumbu, disajikan dengan saus sambal dan biasanya dengan hiasan mentimun. Masakan ini dibuat oleh imigran dari Hainan di Cina selatan dan diadaptasi dari hidangan ayam Wenchang Hainan.\nBahan :\n- 1 ekor ayam, belah 4\n- 1 buah jeruk nipis\n- 1/2 buah bawang bombay belah 4\n- 2 lebar daun pandan ikat simpul\n- 3 siung bawang putih keprek\n- 3 batang daun bawang, iris agak panjang\n- 2 ruas jahe, geprek\n- garam secukupnya\n- 1 sdt kecap ikan\n- 1 sdm minyak ayam\n- 1 1/2 liter air.",
            "Nasi uduk atau dalam bahasa Belanda rijst vermengd met onrust van de liefde adalah nama makanan yang terbuat dari bahan dasar nasi putih yang diaron dan dikukus dengan santan, serta dibumbui dengan pala, kayu manis, jahe, daun serai dan merica.\nBahan :\n- 300 gram beras putih\n- 1 lembar daun salam\n- 2 cm lengkuas\n- 200 ml santan, beri 1 sdt garam\n- 400 ml air.",
            "Mie Gacoan merupakan jaringan restoran mie pedas nomor 1 di Indonesia, yang pertama kali berdiri di tahun 2016 lalu. Harga makanan yang murah, menu mie pedas yang enak dan mengenyangkan, serta konsep resto yang merakyat membuat banyak orang rela mengantre hingga berjam-jam untuk bisa mencicipi mie pedas satu ini.\nBahan :\n- 35 gram FiberCreme\n- 3 gram kaldu ayam bubuk\n- 100 ml air untuk blender dan tumis\n- 30 gram bawang putih\n- 50 gram cabai rawit merah\n- 25 ml minyak goreng untuk menumis.",
            "Mie ayam atau bakmi ayam adalah hidangan Indonesia yang terbuat dari mie gandum kuning yang dibumbui dengan daging ayam yang biasanya dipotong dadu. Hidangan ini banyak terpengaruh dengan teknik penyajian kuliner yang digunakan dalam hidangan Tiongkok.\nBahan :\n- 300 gram mi telur, rebus sampai empuk\n- 6 sdm minyak ayam bawang\n- 3 sdt kecap asin\n- 2 ikat sawi hijau, celup sebentar ke air mendidih, angkat, sisihkan.",
            "Gado-gado adalah makanan khas Jakarta berupa sayur-sayuran yang direbus, irisan telur dadar, serta ditaburi bawang goreng dan kerupuk. Sayur-sayuran ditambahkan dengan bumbu kacang atau saus dari kacang tanah yang telah dihaluskan yang kemudian diaduk merata.\nBahan :\n- 350g kentang, rebus, goreng, potong-potong\n- 350g tahu putih, potong kotak 3 cm\n- 350g tempe, potong kotak 3 cm\n- 7 lembar daun selada, sobek-sobek\n- 2 buah ketimun, iris tipis\n- 100g taoge, rebus\n- 200g kol, iris kasar, rebus\n- minyak, untuk menggoreng dan menumis.",
            "Gudeg adalah hidangan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat hidangan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan.\nBahan :\n- 800 gram nangka muda\n- 1/2 ekor ayam\n- 2 cm lengkuas\n- 1.000 ml air kelapa muda\n- 2 lembar daun salam\n- 1.000 ml santan yang diambil dari 1 1/2 butir kelapa\n- 5 lembar daun jati.",
            "Coto makassar atau coto mangkasara adalah makanan tradisional Suku Makassar, Sulawesi Selatan. Makanan ini terbuat dari jeroan sapi yang direbus dalam waktu yang lama. Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu yang diracik secara khusus.\nBahan :\n- 500g daging sapi has dalam, potong dadu\n- 2 batang serai\n- 1cm lengkuas\n- 1cm jahe\n- 3 lembar daun salam\n- 200g kacang tanah goreng tanpa kulit, haluskan\n- 2L air\n- 1 sdm Royco Kaldu Sapi\n- 2 sdm Bango Kecap Manis\n- 3 sdm minyak.",
            "Kaki Lembu Donggala atau yang lebih dikenal dengan nama Kaledo ini adalah makanan khas masyarakat Donggala yang terletak di provinsi Sulawesi Tengah, tepatnya di kota Palu. Makanan ini mirip dengan sup buntut, bedanya tulangnya dari kaki lembu dan disajikan bukan dengan nasi melainkan dengan ubi.\nBahan :\n- 1 kg tulang kaki sapi berdaging\n- 2 liter air\n- 5 buah asam jawa mentah yang sudah dibersihkan\n- 20 cabe rawit hijau ditumbuk\n- 1 buah jeruk nipis\n- garam secukupnya\n- bawang goreng sebagai taburan\n- ubi rebus.",
            "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate.\nBahan :\n- 4 buah paha ayam fillet, diambil dagingnya dan disisihkan kulitnya\n- 5 sendok makan kecap manis\n- 1 sendok makan minyak goreng\n- 22 buah tusuk sate."
    };

    private static int[] foodImages = {
            R.drawable.nasi_goreng,
            R.drawable.nasi_ayam,
            R.drawable.nasi_uduk,
            R.drawable.mie_gacoan,
            R.drawable.mie_ayam,
            R.drawable.gado_gado,
            R.drawable.gudeg,
            R.drawable.coto_makassar,
            R.drawable.kaledo,
            R.drawable.sate
    };

    static ArrayList<FoodModel> getListData(){
        ArrayList<FoodModel> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++){
            FoodModel foodmodel = new FoodModel();
            foodmodel.setName(foodNames[position]);
            foodmodel.setDetail(foodDetails[position]);
            foodmodel.setPhoto(foodImages[position]);
            list.add(foodmodel);
        }
        return list;
    }
}

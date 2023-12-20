package day_49_murat;

public enum TestEnvironments {
    // enum ozel bir classtir
    // enum da obje olusturulamaz.icinde sabit degerler vardir.sabit olan degiskenler variableleri burada tutariz
    //tum metotlari static olarak kullaniyoruz

    QA_ENV("www.qa.com"),// bunlarin url leri bellidir.bu url lerin burda kalmasini istiyorum
    STAGING_ENV("www.staging.com"),// bunlar cagiracagim islem yapacagim parametrelerimdir
    USERNAME("java@)guidersoft.com"),
    PASSWORD("123456qw");


    final String VALUE;

    TestEnvironments(String value) {
        this.VALUE = value;
    }

    public static String getValues() {


        return null;
    }
}



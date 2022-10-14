public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Павел";
        post.passport = "17 51 454545";
        post.phone = "+7 (999) 999-99-99";
        post.patronymic = "Игнатович";
        post.surname = "Сюрманов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 11;
        post.birthday.year = 1999;
    }
}

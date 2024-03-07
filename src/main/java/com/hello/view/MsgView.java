package com.hello.view;

public class MsgView {
    public String head(String title) {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset='UTF-8'>\n" +
                "<meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
//                "<link rel='icon' type='image/ico' href='../img/cruz.ico'>\n" +
//                "<link rel='stylesheet' type='text/css' href='../css/reset.css'>\n" +
                "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'\n" +
                "    integrity='sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN' crossorigin='anonymous'>\n" +
                "<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'\n" +
                "    integrity='sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN' crossorigin='anonymous'>\n" +
                "<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css'>\n" +
                "<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js'\n" +
                "    integrity='sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL'\n" +
                "    crossorigin='anonymous'></script>\n" +
                "    <title>" + title + "</title>\n" +
                "</head>\n";
    }

    public String body(String content) {
        return "<body>\n" +
                "<div class='container'>\n" +
                content +
                "</div>\n" +
                "</body>\n" +
                "</html>\n";

    }

    public String dom(String head, String body) {
        return head+body;
    }

    public String div(String classDiv, String content) {
        return "<div class='"+classDiv+"'>\n" +
                content +
                "</div>\n";
    }

    public String h1(String classH1 ,String content) {
        return "<h1 class='"+classH1+"'>"+content+"</h1>\n";
    }
}

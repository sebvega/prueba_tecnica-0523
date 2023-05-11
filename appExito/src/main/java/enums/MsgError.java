package enums;

public enum MsgError {

    MSG_SELECTED_HOTEL_DOES_NOT_CONTAINS(
            "------ ERROR ------ El hotel seleccionado no cuenta con la caracteristica SPA deseada en los detalles de sus ofertas."),
    MSG_INFO_ERROR_COMPARE_TEXT("Contenga en sus detalles SPA");

    private String msg;

    private MsgError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}

package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ExitoPage {

    public static final Target BTN_SING_UP = Target.the("user make click on bottom to sing up")
            .locatedBy("//android.widget.Button[@text='Registrarse']");
    public static final Target INPUT_NAME = Target.the("user input first name")
            .locatedBy("//android.widget.EditText[@text='Nombres']");
    public static final Target INPUT_LAST_NAME = Target.the("user input last name")
            .locatedBy("//android.widget.EditText[@text='Apellidos']");
    public static final Target INPUT_ID = Target.the("user input the id")
            .locatedBy("//android.widget.EditText[@text='Número de documento']");
    public static final Target INPUT_CELLPHONE = Target.the("user input cellphone on the label")
            .locatedBy("//android.widget.EditText[@resource-id='com.exito.appcompania:id/TextInputEditText_tel']");
    public static final Target INPUT_EMAIL = Target.the("user input cellphone on the label")
            .locatedBy("//android.widget.EditText[@text='Correo electrónico']");
    public static final Target CLK_YEAR = Target.the("user input year of born")
            .locatedBy("//android.widget.Spinner[@text='Año']");
    public static final Target CLK_MONTH = Target.the("user input month of born")
            .locatedBy("//android.widget.Spinner[@text='Mes']");
    public static final Target CLK_DAY = Target.the("user input day of born")
            .locatedBy("//android.widget.Spinner[@text='Dia']");
    public static final Target BTN_CONTINUE = Target.the("user tap for continue")
            .locatedBy("//android.widget.TextView[@resource-id='com.exito.appcompania:id/AppCompatTextView_iniciar']");
    public static final Target BACK = Target.the("user")
            .locatedBy("//android.widget.Button[@resource-id='com.exito.appcompania:id/MaterialButton_goBack']");
    public static final Target CLK_ACCEPT = Target.the("click on accept to exit")
            .locatedBy("//android.widget.Button[@text='Aceptar']");


    public static final Target GET_IN = Target.the("click to start session")
            .locatedBy("//android.widget.Button[@text='Ingresar']");


    public static final Target PUT_EMAIL = Target.the("click to add email")
            .locatedBy("//android.widget.EditText[@text='Correo electrónico']");
    public static final Target PASSWORD = Target.the("click to add password")
            .locatedBy("//android.widget.EditText[@text='Contraseña']");
    public static final Target INSIDE = Target.the("click to start session")
            .locatedBy("//android.widget.Button[@text='Ingresar']");

}

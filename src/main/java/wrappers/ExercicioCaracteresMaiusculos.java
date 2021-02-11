package wrappers;

public class ExercicioCaracteresMaiusculos {

    public static void main(String[] args) {
        String minuscula = converteEmMinuscula('G');
        System.out.println(minuscula);
    }

    public static String converteEmMinuscula(Character letra) {
        //return Character.toLowerCase(letra)+"";

        //return Character.toString(Character.toLowerCase(letra));

//        char letraEmChar = letra;
//        int codigoDaLetra = letraEmChar;
//        int codigoDaMinuscula = (int) codigoDaLetra+32;
//        char letraMinuscula = (char) codigoDaMinuscula;
//        return Character.toString(letraMinuscula);

        int codePoint = letra + 32;
        return Character.toString(codePoint);
    }
}

package geco;

/**
 *
 *    Class qui permet de generer Un mot de passe Aleatoire
 */
public class PasswordGeneration {


        public PasswordGeneration ()
        {

        }

        public String RandomGeneration ( int taille )
        {
            String mdp = "";

            for ( int i= 0 ; i < taille ;i++ )
            {
                mdp += ""+Math.random();
            }

            return  mdp;
        }
}

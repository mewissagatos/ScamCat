import java.util.Scanner;
public class ScamCat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia = 1;
        int opcao = 0;
        System.out.println("*  ⠰⣤⣠⡴⠀     ⠒⠲⣦⡀*   \n" +
                "⠠⠴⢿⣿⣧⣄     ⠀ ⠀⣼⡇       *\n" +
                "*⠀  ⠘⠇⠀⠀⠈⠶⠶⠾⠟⠀*\n" +
                "⠀⠀⠀⣶⣤⣀⣀⣀⣠⣴⡆\n" +
                "⠀⠀⠀⣹⣿⣿⣿⣿⣿⣿⡁\n" +
                "⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⡇\n" +
                "⠀⢀⡀⠘⣿⣿⣿⣿⣿⠋⠀\n" +
                "⢠⣿⠋⣠⣿⣿⣿⣿⣿⣧\n" +
                "⢸⣿⢠⣿⣿⣿⣿⣿⣿⣿⣧\n" +
                "⠘⣿⣼⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⠀⠈⠻⠿⠿⠿⠿⠿⠿⠟⠃");
        System.out.println("O gato Maurício é um gato solteiro, \nque fica em casa o dia inteiro. \nCom o final de semana chegando pra valer, \nvai pra internet tentar se entreter!");
        System.out.println(" ");
        while(dia <= 3){
            switch(dia){
                case 1:
                    System.out.println("≽₍^_ ‸ _ ^₎≼⟆");
                    System.out.println("•┈୨ Dia 1 ✩ Sexta-Feira ୧┈•");
                    System.out.println("\n₍^.  ̫ .^₎ のᗦ↞\uFE0E◃\uFE0E");
                    System.out.println("O Gato Maurício adora mexer no tablet, porém a internet está repleta de Hauckers (Cachorros Hackers).");
                    System.out.println("tentando roubar suas senhas e seus sachês...");
                    System.out.println("De repente, ele recebe uma mensagem no Catsapp: \n[CatsApp]: 'Miau dia! Você ganhou 1 ano de sachê grátis! Clique aqui e faça login com sua conta do Miaugram para resgatar: https://sache-gratis-promocao.com");
                    System.out.println("\n(៸៸᳐>⩊<៸៸᳐) \nO que o Maurício deve fazer?");
                    System.out.println("[1] Clicar no link correndo e digitar a senha para garantir o sachê!");
                    System.out.println("[2] Desconfiar da mensagem estranha, bloquear o contato e ir tirar uma soneca.");
                    opcao = sc.nextInt();
                    if (opcao == 1){
                        System.out.println("\n(╥﹏╥) Oh nao! Era um link falso! \nOs Hauckers roubaram a conta do Miaugram do Maurício e sumiram com seus saches virtuais.");
                        System.out.println("Maurício termina a sexta-feira triste e com fome de sache.");
                    } else if (opcao == 2) {
                        System.out.println("\n( ˶ˆᗜˆ˵ ) Mandou bem! \nMaurício sabe que promoçoes exageradas e links esquisitos sao golpes de phishing.");
                        System.out.println("Ele tira uma soneca deliciosa e segura.");
                    } else {
                        System.out.println("\n(?) \nMaurício ficou confuso e nao fez nada..");
                    }
                    System.out.println("•┈୨ Fim da Sexta-Feira ୧┈•");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("　　　  　　／＞　　フ\n" +
                            "　　　 　　| 　_　 _ l\n" +
                            "　 　　 　／` ミ＿xノ\n" +
                            "　　 　 /　　　 　 |\n" +
                            "　　　 /　 ヽ　　 ﾉ\n" +
                            "　 　 │　　|　|　|\n" +
                            "　／￣|　　 |　|　|\n" +
                            "　| (￣ヽ＿_ヽ_)__)\n" +
                            "　   二つ");
                    System.out.println("•┈୨ Dia 2 ✩ Sabado ୧┈•");
                    System.out.println("\n♡ ꒰^_  _^  ྀིྀ꒱੭");
                    System.out.println("O Gato Maurício quer uma namorada, \nentão vai até o Tinder para Gatos,");
                    System.out.println("Mas ele precisa criar uma senha segura! \nPara os Hauckers não invadirem sua conta");
                    System.out.println("e postarem as fotos constrangedoras dele tomando banho..");
                    System.out.println("\n₍₍⚞(˶˃ ꒳ ˂˶)⚟⁾⁾ \nQual senha o Maurício deve escolher?");
                    System.out.println("[1] Usar a senha 'Mauricio123', é super fácil de lembrar!");
                    System.out.println("[2] Usar a senha 'M4ur1c10_g4t0l0uc0#2026', chata e difícil.");
                    opcao = sc.nextInt();
                    if (opcao == 1){
                        System.out.println("\n(O_O) ALERTA DE INVASÃO!");
                        System.out.println("A senha 'Mauricio123' é muito fraca. Os Hauckers usaram um ataque de forca bruta,");
                        System.out.println("e hackearam o perfil em 5 segundos! \nAgora todos viram o Mauricio ensaboado...");
                        System.out.println("Mauricio termina o sábado morrendo de vergonha.");
                    } else if (opcao == 2) {
                        System.out.println("\n(⌐■_■) Hacker-proof!");
                        System.out.println("Essa é uma senha forte! Senhas longas e com caracteres variados sao muito difíceis de quebrar.");
                        System.out.println("O perfil do Mauricio esta seguro e ele ganha 5 novos 'matches'.");
                    } else{
                        System.out.println("\n(?) \nMauricio dormiu no teclado e criou uma senha aleatória que nem sabe.");
                    }
                    System.out.println("•┈୨ Fim do Sabado ୧┈•");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("♡    ∧,,,∧　　     ∧,,,,∧\n" +
                            "　(  ̳• ·̫ • ̳)っ♡꒰〃ˊ͈ ˙̫ ˋ͈〃꒱\n" +
                            "  (￣∪￣￣￣)     (￣ ∪∪￣￣)");
                    System.out.println("•┈୨ Dia 3 ✩ Domingo ୧┈•");
                    System.out.println("\nMaurício marcou um encontro com a gatinha Aurora do Tinder num beco escuro,");
                    System.out.println("mas a foto do perfil dela era muito perfeita... \n... \nParecia até gerada por IA!");
                    System.out.println("\n/ᐠ • ·̫ •マ");
                    System.out.println("O que Maurício deve fazer?");
                    System.out.println("[1] Ir ao encontro de banho tomado e com um buque de erva-de-gato!");
                    System.out.println("[2] Desistir, ficar no sofa seguro em casa e ver TV.");
                    opcao = sc.nextInt();
                    if (opcao == 1) {
                        System.out.println("\n(×_×) GAME OVER VERDADEIRO!");
                        System.out.println("A gatinha era na verdade... \n... \n... \n!!! \num bando de Hauckers disfarçados!");
                        System.out.println("Maurício caiu no golpe da Catfish e foi sequestrado.");
                        System.out.println("Fim trágico para o nosso herói felino...");
                    } else if (opcao == 2) {
                        System.out.println("\n( ˘͈ ᵕ ˘͈♡) Ufa! Salvo pelo bom senso!");
                        System.out.println("Maurício decide ficar em casa. Ao ler o jornal, ele descobre que vários gatos");
                        System.out.println("foram sequestrados no beco escuro pela gangue da Catfish.");
                        System.out.println("Ele respira aliviado, come um sachê guardado e vai dormir em paz.");
                    } else {
                        System.out.println("\n(?) \nMaurício tentou miar, se assustou com o próprio reflexo e se escondeu debaixo da cama.");
                    }
                    System.out.println("•┈୨ Fim do Domingo ୧┈•");
                    System.out.println(" \n ");
                    break;

            }
            dia = dia + 1;
        }
        System.out.println("•┈୨ Fim de Jogo! ୧┈•");
        sc.close();
    }
}

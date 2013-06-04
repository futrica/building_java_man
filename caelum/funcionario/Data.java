class Data{
    int dia = 0, mes = 0, ano = 0;

    void mostraData(){
        System.out.println(dia + "/" + mes + "/"+ ano);
    }

    void anoQueVem(){
        ano = ano + 1;
    }

    void semanaQueVem(){
        dia = dia +7;
    }

    void mesQueVem(){
        mes = mes +1;
    }
}

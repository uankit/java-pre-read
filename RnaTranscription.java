class RnaTranscription {

    String transcribe(String dnaStrand) {
        String transcribed = "";
        for (int i=0;i<dnaStrand.length();i++){
            switch (dnaStrand.charAt(i)){
                case 'G':
                    transcribed = transcribed.concat("C");
                    break;
                case 'C':
                    transcribed = transcribed.concat("G");
                    break;
                case 'T':
                    transcribed = transcribed.concat("A");
                    break;
                case 'A':
                    transcribed = transcribed.concat("U");
                    break;
                default:
                    transcribed = "";
            }
        }
        return transcribed;
    }

}
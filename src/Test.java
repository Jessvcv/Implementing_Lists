public class Test {
    public static void main(String[] args) {
        // AList Test
        AList<Song> AListplaylist = new AList<>();
        AListplaylist.addy(new Song("Coral Crown", "Darren Korb", 4.07));
        AListplaylist.addy(new Song("CASANOVE POSSE", "ALI", 4.00));
        AListplaylist.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        AListplaylist.addy(new Song("Supernatural", "Ariana", 3.50));
        System.out.println("AList Playlist:");
        System.out.println(AListplaylist.toString());

        AListplaylist.removy(0);
        System.out.println("After removing song:");
        System.out.println(AListplaylist.toString());

        // SLList Test
        SLList<Song> SLListplaylist = new SLList<>();
        SLListplaylist.addy(new Song("Coral Crown", "Darren Korb", 4.07));
        SLListplaylist.addy(new Song("CASANOVE POSSE", "ALI", 4.00));
        SLListplaylist.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        SLListplaylist.addy(new Song("Supernatural", "Ariana", 3.50));
        System.out.println("SLList Playlist:");
        System.out.println(SLListplaylist.toString());

        SLListplaylist.removy(0);
        System.out.println("\nAfter removing song:");
        System.out.println(SLListplaylist.toString());

        // DLList Test
        DLList<Song> DLListplaylist = new DLList<>();
        DLListplaylist.addy(new Song("Coral Crown", "Darren Korb", 4.07));
        DLListplaylist.addy(new Song("CASANOVE POSSE", "ALI", 4.00));
        DLListplaylist.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        DLListplaylist.addy(new Song("Supernatural", "Ariana", 3.50));
        System.out.println("\nDLList Playlist:");
        System.out.println(DLListplaylist.toString());

        DLListplaylist.removy(0);
        System.out.println("\nAfter removing song:");
        System.out.println(DLListplaylist.toString());
    }
}

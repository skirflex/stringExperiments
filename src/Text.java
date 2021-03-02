public class Text {
    public static void main(String[] args) {
        //Программа вывода каждого слова отдельно в каждой строке
        String text = """
                One of the most famous statues in the world stands on an island in New York. This statue is the Statue of Liberty — 
                a woman holding a torch. Visitors can go inside the statue. The statue is so large that as many as twelve people can stand inside the torch. 
                Many people can stand in other parts of the statue. The statue weighs 225 tons and is about 100 metres high.                        
               The statue of Liberty, was put up in 1886. It was a gift to the United States from the people of France for 
                America’s 100th birthday. French people gave money for the statue. Americans designed and built the pedestal. 
                The French engineer Alexander Eiffel, who was famous for his Eiffel Tower in Paris, found out how to make the heavy statue stand. 
                People who come to the United States see the Statue of Liberty holding her torch. She symbolises a welcome to a land of freedom.
                """;
        String [] array;
        text = text.trim();
        array = text.split("\\b\\s+");
        for (int i = 0 ; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("\n" + array.length);
    }
}

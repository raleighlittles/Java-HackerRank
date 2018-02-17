// Write your Checker class here

class Checker implements Comparator<Player> 
{
    @Override
    public int compare(Player player1, Player player2)
    {
        // if 2 players have the same score, sort alphabetically by name
        if (player1.score == player2.score)
        {
            return (player1.name).compareTo(player2.name);
        }
        
        else
        // The compare function has to return a negative number if player1 should be placed before player2, or a positive number
        // ...if player2 should go before player1. We want to sort on descending order
        {
            return (player2.score - player1.score);
        }
       
    }

}
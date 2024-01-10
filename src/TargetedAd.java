public class TargetedAd {

  public static void main(String[] args)
  {
    /*  
     * TODO:
     * 
     * PROGRAMMING
     * (4) Compare each user's post to each target word. If a user mentions a target word, add their username to 
     *     the String of users. Separate usernames with a space. 
     *         Hint: You can use loops to look through each word. 
     *         Hint2: You can use indexOf to check if a word is in a user post. 
     * (5) Once you have all the users, use your DataCollector's prepareAdvertisement method to prepare a file 
     *     with all users and the advertisement you will send them.
     *         Additional Info: The prepareAdvertisement creates a new file on your computer. Check the posts of
     *         some of the usernames to make sure your algorithm worked.
     * 
     * THE FINAL SOLUTION
     * (6) Your solution should work with the socialMedialPostsSmall.txt. Modify your DataCollector initialization
     *    so you use the socialMediaPosts.txt. You should now have a larger file of users to target.
     */


    /* your code here */
    DataCollector dataCollector = new DataCollector();
    dataCollector.setData("socialMediaPosts.txt", "targetWords.txt");

    String usernames = "";
    while (true) {
      String post = dataCollector.getNextPost();
      String user = post.split(" ")[0];
      if (post.equalsIgnoreCase("none")) {
        break;
      }
      if (post.contains(dataCollector.getNextTargetWord())){
        usernames += user;

      }

    }
  }

}

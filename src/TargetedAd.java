public class TargetedAd {

  public static void main(String[] args)
  {
    /*  
     * TODO:
     * 
     * PROGRAMMING
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

    String[] dogWords = {
            "dog",
            "doggy",
            "dogs",
            "pup",
            "puppy",
            "doggie",
            "wolf",
            "fur",
            "chewed"
    };
    String[] catWords = {
            "cat",
            "kitten",
            "lion",
            "#bestkittyever"
    };

    String dogUsernames = "";
    String catUsernames = "";
    String othersUsernames = "";

    while (true) {
      String post = dataCollector.getNextPost();
      String user = post.split(" ")[0];
      if (post.equalsIgnoreCase("none")) {
        break;
      }
      boolean found = false;
      for (String word : dogWords) {
        if (post.contains(word)) {
          dogUsernames += user + " ";
          found = true;
          break;
        }
      }
      if (found) continue;
      for (String word : catWords) {
        if (post.contains(word)) {
          dogUsernames += user + " ";
          found = true;
          break;
        }
      }
      if (found) continue;
      othersUsernames += user + " ";
    }
  }
}

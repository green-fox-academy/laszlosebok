package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  //  store a list of BlogPosts
  //  add BlogPosts to the list
  //  delete(int) one item at given index
  //  update(int, BlogPost) one item at the given index and update it with another BlogPost
  private List<BlogPost> blogPostList = new ArrayList<>();
  
  public void addPost(BlogPost blogPost){
    blogPostList.add(blogPost);
  }
  
  public void delete(int index){
    blogPostList.remove(index);
  }
  
  public void update(int index, BlogPost blogPost) {
    blogPostList.set(index, blogPost);
  }
  
  public List<BlogPost> getBlogPostList() {
    return blogPostList;
  }
}

public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
    int numberOfArticle;
 public PhDStudent(int id,float mid,float fin,int conf,int numberOfArticle){
     super(id,mid,fin,conf);
     this.numberOfArticle=numberOfArticle;
 }
 @Override
    float computeTotalScore(){
     return super.computeTotalScore()+this.articleScore();
 }
 @Override
    public float articleScore(){
     return numberOfArticle*8;
 }
}

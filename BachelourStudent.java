public class BachelourStudent extends Student implements ProjectScoreBehaviour{
    BachelourStudent(int id , float mid , float fin){
        super(id,mid,fin);
    }
    @Override
    float computeTotalScore(){
        return super.computeBaseScore()+projectScore();
    }
    @Override
    public float projectScore(){
       return 20;
    }

}

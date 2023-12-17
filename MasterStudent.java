public class MasterStudent extends Student implements CoferenceScoreBehavior{
    protected int numberOfConf;
    public MasterStudent(int id, float mid, float fin, int conf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }
    @Override
    float computeTotalScore(){
        return  super.computeBaseScore()+this.conferenceScore();
    }
    @Override
    public float conferenceScore(){
        return numberOfConf;
    }
}

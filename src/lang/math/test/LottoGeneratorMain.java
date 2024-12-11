package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        System.out.println("로또 번호:" + lottoGenerator.getLottoNumbers().toString());
    }
}

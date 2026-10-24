public class ComplexNumCalculator {

    int nOpDone;
    ComplexNum lastRes;
    
    void build() {
        this.nOpDone = 0;
        this.lastRes.re = 0;
        this.lastRes.im = 0;
    }

    ComplexNum add (ComplexNum first, ComplexNum second) {
        this.nOpDone++;
        this.lastRes.re = first.re + second.re;
        this.lastRes.im= first.im + second.im;
        return this.lastRes;
    }

    ComplexNum sub (ComplexNum first, ComplexNum second) {
        this.nOpDone++;
        this.lastRes.re = first.re - second.re;
        this.lastRes.im = first.im - second.im;
        return this.lastRes;
    }

    ComplexNum mul (ComplexNum first, ComplexNum second) {
        this.nOpDone++;
        this.lastRes.re = first.re * second.re;
        this.lastRes.im = first.im * second.im;
        return this.lastRes;
    }

    ComplexNum div (ComplexNum first, ComplexNum second) {
        this.nOpDone++;
        this.lastRes.re = first.re / second.re;
        this.lastRes.im = first.im / second.im;
        return this.lastRes;
    }
}

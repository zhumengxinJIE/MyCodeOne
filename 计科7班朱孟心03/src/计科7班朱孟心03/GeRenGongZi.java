package 计科7班朱孟心03;

public class GeRenGongZi implements GongZi,QiTaShouRu,GeRenSuoDeShui {
	public double gongzi(){
		return jbgz*2;
	}
	public double jj() {
		return jj;
	}
	public double jbbz() {
		return jbbz;
	}
	public double rcbt() {
		return rcbt;
	}
	public double jianzhi() {
		return jianzhi;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double bx,js,z,s;
		s=jbgz+jj+rcbt+jbbz+jianzhi;
		if(s>=5500)
		{
			js=(s-5500)*0.08;
		}
		else js=0;
		GeRenGongZi gz=new GeRenGongZi();
		bx=(jbgz+jj+rcbt+jbbz+jianzhi)*0.12;
		z=(jbgz+jj+rcbt+jbbz+jianzhi)-js-bx;
		System.out.println("心杰集团工资财务表");
		System.out.println("张三的工资：");
		System.out.println("基本工资："+gz.gongzi());
		System.out.println("奖金："+gz.jj());
		System.out.println("加班补助："+gz.jbbz());
		System.out.println("人才补贴："+gz.rcbt());
		System.out.println("其他收入："+gz.jianzhi());
		System.out.println("个人所得税："+(jbgz+jj+rcbt+jbbz+jianzhi-5500)*0.08);
		System.out.println("五险一金："+(jbgz+jj+rcbt+jbbz+jianzhi)*0.12);
		System.out.println("总工资："+z);

	}

}

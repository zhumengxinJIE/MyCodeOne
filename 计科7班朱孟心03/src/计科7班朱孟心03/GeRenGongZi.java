package �ƿ�7��������03;

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
		// TODO �Զ����ɵķ������
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
		System.out.println("�Ľܼ��Ź��ʲ����");
		System.out.println("�����Ĺ��ʣ�");
		System.out.println("�������ʣ�"+gz.gongzi());
		System.out.println("����"+gz.jj());
		System.out.println("�Ӱಹ����"+gz.jbbz());
		System.out.println("�˲Ų�����"+gz.rcbt());
		System.out.println("�������룺"+gz.jianzhi());
		System.out.println("��������˰��"+(jbgz+jj+rcbt+jbbz+jianzhi-5500)*0.08);
		System.out.println("����һ��"+(jbgz+jj+rcbt+jbbz+jianzhi)*0.12);
		System.out.println("�ܹ��ʣ�"+z);

	}

}

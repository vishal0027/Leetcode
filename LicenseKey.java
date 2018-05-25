package google;
public class LicenseKey {
	public static String sol(String input, int k){
		int DashCount = 0; int SubLen = 0; StringBuffer res = new StringBuffer();int len=input.length()-1;
		for(int i=len; i>=0; i--){
			if(input.charAt(i) == '-') DashCount++;
		}
		//--------------------------------------------
		while(len>=0){
			if(input.charAt(len) != '-' && SubLen < k){
				res.append(input.charAt(len));
				SubLen++;
			}else if (input.charAt(len) == '-' && SubLen==k){
				if(DashCount > 0){
					res.append('-'); DashCount--;
					SubLen = 0;
				}else{
					return "ERROR The License Cannot be Formated as asked.";
				}
			}else if (SubLen == k){
				if(DashCount > 0){
					res.append('-');res.append(input.charAt(len));DashCount--;
					SubLen=1;
				}else{
					return "ERROR The License Cannot be Formated as asked.";
				}	
			}
			len--;
		}
		if (res.charAt(res.length()-1) == '-') res.deleteCharAt(res.length()-1);// Could Possibly have '-' at last place.
		return res.reverse().toString().toUpperCase();
	}
	// Tester
	public static void main(String args[]){
		String test = "-------324-3---435--43--32-4-324-32-5-4-3-23233sefesrgawwe24325-423-2354-----------23-5321-mkgfg-43-532rnmjg0trgmfsjgaw--234n23toreftewfdgfghuiougyftcvibuoj-dfgdsfgfdsfsghfd-zhsdf"
				+ "dfhgfhdfghf-gf-sg-h-we--43jewnfijt43i9984384tnregs----dg-ergdfngndfjgdf-gjegdfngjhdsbnghhelloIamVishalMalikdsfhuidgdfd--"
				+ "gdfgnjksdanhjgdsfdf-gfdh-fdgdsjnfdhjsgjhdfngjdfgfdjnfkjsdiof-u432----"
				+ "sdfdefesfew-fenfjdnfkwefjmidfnusujnfiu32948943593023-3245tf45-43f34-532rwf-q34-qw345r34f-3-t-34-5-r4fj34iuj8onfui43r8o4wf43--"
				+ "34j5ior43nfuin34iorj439jfnejwntnio4395949590439543543tre-t-e---43re-t43-t4-5t5-fe-wtr-34-rw-ero-q34-rweor3-or-werr-34-ro3-2o-43"
				+ "43--54-65-5g5k4093-23-ro34-----45---4534---------------------------------------------------------45646-5-46htgrhttr--busbduibfuid--f"
				+ "njdsnfjdngoiudsf--f---------------dsfg-df-g-df--b-fds-v-dsf-f-3-34-5-43--43-43-24-3-4-32-4-3-34-tfr-e-gfds-g--asd-gf-ag-sdag-adgsd-ag-er-gs-dg"
				+ "-fdg-ds-fds-g-fd-g-h-d-fg-a-h-aahafjknakjnbyhjbvhcvbuibvds--d-fg-df-h-df--hs-sdf--n-hgfhm-j-hfgnxdz-s_fh-j-gfz--adg-f-gfs-hfh-g-hc-xz-dfg-ds-g-hdsf-g-fh-fgnj-ghf--bsfd-fe-asd-f-ds-g-df-gds"
				+ "fd--df-g-dfh-fg-bfdwer344wer34r34y78y3784f6gw346rg8w7f78q23gh897rh87wya87y34r78t348wtgq78grt78w34qgf78q34g78ry478wy"
				+ "gdf-hfgh-fgh-fgj-gfh-hfd-g-df--fanofnbokasdgnljnvjkadfsdfsd-f-w-e-23--3-43-24-32-dfd-g-43-t-34-t-g3-t--r43--f34-t-43-43-r-43-rf-34-"
				+ "e-34-r--wqeg--hrht--hg34-t-43-r4-g-43q4-g-erw-g-sdf-g45ge-w-43h3h-r-eg--a-s-f-g-h-54-34g-re--gdrew-rt-rew-r-terw-r-wt-w-retg-fdvsdnfkjdnsfknsdkjf"
				+ "mjenfndshgniunejfnuin-vuinbeiuanfiuwjeinfnuigbnfdbxnfnhgfauihfawekjndsjkafnjkdngjkrenbunbgeinakng3---3-4-5-23-4-32--refgdjsnkf--few-fewf3432f34534fewq-r34rwefsdg-34w"
				+ "-34-5-34-f-rew43-5-34--f-r-hgrbemjgfnjekndfaggjkhwergf--34-5-435-34-frv-qew-kbdnfdhjksf90df0dgdf00g-fd-g-dfg-df-g--dsag-er-g-re-g-h-34-5423-g-er-g-q34-t-435g-re--g-reg-ar-g-er"
				+ "-34--43-5-3-tgerw-g-d-he-rty-h-ergergerger-gt-43-t-4-t4-t-ew-ygrs-egkerkgmnkjrngjkdfngkjnerjgerg---df-sg--dfs-fgdh-g-df-h-g-h-fgd-h-dfs-g-dsf-hgh"
				+ "-dfg--dfsh-ds-h-fgh-gfdh-fgh--fgs-hgfsgdfkjsngjdfbghjdsnbkjnskfnkjfdngkjlffnjkdsahgfuahf-df-gf-g--d-fsg-dfs-hgdfs---hgfh-dfgh-fdgj-hfgdj-fgsh-sfg"
				+ "-df-gdf-g-dfs-gdf-g-df-ga-g-gh-fgdhjknfgjkhndfjngjdfngjkfndjkgjdfkhgjkdfhgjkdhuahfkhaiushuiahgiuerhguiehiuahjioerjiughfdkghiuera--jbghabuighjnagiuabhuigaeg-g-dg-"
				+ "gjnbghkabghesrngdf-g-df-g-dfgn dfjgndkjafgnjkfsdf--df-hsdfngjksdfnkjdfnkh--df-dfngdajkgr-eg-dfngfdg-ad-gakjfw--a-fa8u843934-43-9--sda-sdfgrtq34--fq-3-4t-q34ewgfq34------"
				+ "----------------------------------------fxdhsfgdrshserg-q34nreqwjhbfajhwbfuiq238y348werew-faew-we---------------------";
		System.out.println(test.length());
		long str = System.currentTimeMillis();
		String temp = sol(test,40);
		long end = System.currentTimeMillis();
		System.out.println(temp);
		System.out.println("Start = "+str);
		System.out.println("End = "+end);
		System.out.println("Time Diff "+(end-str));

		
	}
}

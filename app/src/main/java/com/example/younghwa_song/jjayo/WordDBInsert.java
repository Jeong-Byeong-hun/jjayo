package com.example.younghwa_song.jjayo;

import android.content.Context;

public class WordDBInsert {
    private Context mContext = null;

    public WordDBInsert(Context context){
        this.mContext = context;
        mContext.getResources();
    }

    public void wordInsert(){
        final DBHelper dbHelper = new DBHelper(mContext, "TEST3.db", null, 1);

        dbHelper.insert("排", "열", "pái", 1, (int) R.drawable.pai);
        dbHelper.insert("座", "좌석", "zuò", 1, (int) R.drawable.zuo);
        dbHelper.insert("您", "당신, 2인칭 존칭", "nín", 1, (int) R.drawable.nin);
        dbHelper.insert("的", "~의", "de", 1, (int) R.drawable.de);
        dbHelper.insert("座位", "좌석", "zuò‧wèi", 1, (int) R.drawable.zuowei);
        dbHelper.insert("是", "~이다 = be동사", "shì", 1, R.drawable.shi);


    }

    public void hskWordInsert(){

        //스테이지 100개씩 끊어서
        final DBHelper dbHelper = new DBHelper(mContext, "TEST3.db", null, 1);

        dbHelper.hsk_insert("阿姨","이모, 아주머니","āyí",1);
        dbHelper.hsk_insert("啊","문장 끝에 쓰여 어기를 도움(감탄)","a",1);
        dbHelper.hsk_insert("矮","(키)작다, (높이)낮다","ǎi",1);
        dbHelper.hsk_insert("爱","사랑하다 ","ài",1);
        dbHelper.hsk_insert("爱好","취미","àihào",1);
        dbHelper.hsk_insert("安静","조용하다","ānjìng",1);
        dbHelper.hsk_insert("八","여덟","bā",1);
        dbHelper.hsk_insert("把","~을(목적어를 동사 앞으로 전치시킴) ","bǎ",1);
        dbHelper.hsk_insert("爸爸","아빠","bàba",1);
        dbHelper.hsk_insert("吧","문장 끝에 쓰여 제의, 부탁 등의 어기를 나타냄","ba",1);
        dbHelper.hsk_insert("白","희다","bái",1);
        dbHelper.hsk_insert("百","백","bǎi",1);
        dbHelper.hsk_insert("班","반, 그룹","bān",1);
        dbHelper.hsk_insert("搬","운반하다","bān",1);
        dbHelper.hsk_insert("半","절반","bàn",1);
        dbHelper.hsk_insert("办法","방법","bànfǎ",1);
        dbHelper.hsk_insert("办公室","사무실","bàngōngshì",1);
        dbHelper.hsk_insert("帮忙","도움을 주다","bāngmáng",1);
        dbHelper.hsk_insert("帮助","돕다","bāngzhù",1);
        dbHelper.hsk_insert("包","(종이나 천으로)싸다; 꾸러미","bāo",1);
        dbHelper.hsk_insert("饱","배부르다; 충분히","bǎo",1);
        dbHelper.hsk_insert("报纸","신문","bàozhǐ",1);
        dbHelper.hsk_insert("杯子","컵","bēizi",1);
        dbHelper.hsk_insert("北方","북부 지역","běifāng",1);
        dbHelper.hsk_insert("北京","베이징","Běijīng",1);

        dbHelper.hsk_insert("被","이불; 덮다; ~에게 ~를 당하다","bèi",1);
        dbHelper.hsk_insert("本","책; 근본","běn",1);
        dbHelper.hsk_insert("鼻子","코","bízi",1);
        dbHelper.hsk_insert("比","비교하다","bǐ",1);
        dbHelper.hsk_insert("比较","비교적","bǐjiào",1);
        dbHelper.hsk_insert("比赛","경기(하다)","bǐsài",1);
        dbHelper.hsk_insert("必须","반드시 ~해야 한다","bìxū",1);
        dbHelper.hsk_insert("变化","변화(하다) ","biànhuà",1);
        dbHelper.hsk_insert("表示","표시하다","biǎoshì",1);
        dbHelper.hsk_insert("表演","공연하다","biǎoyǎn",1);
        dbHelper.hsk_insert("别","이별하다; 구별하다","bié",1);
        dbHelper.hsk_insert("别人","타인","biéren",1);
        dbHelper.hsk_insert("宾馆","호텔","bīnguǎn",1);
        dbHelper.hsk_insert("冰箱","냉장고","bīngxiāng",1);
        dbHelper.hsk_insert("不客气","사양하지 않다; 천만에요","búkèqi",1);
        dbHelper.hsk_insert("不","부정부사","bù",1);
        dbHelper.hsk_insert("才","재능; 겨우","cái",1);
        dbHelper.hsk_insert("菜","야채; 반찬","cài",1);
        dbHelper.hsk_insert("菜单","메뉴","càidān",1);
        dbHelper.hsk_insert("参加","참가하다","cānjiā",1);
        dbHelper.hsk_insert("草","풀","cǎo",1);
        dbHelper.hsk_insert("层","층, 겹","céng",1);
        dbHelper.hsk_insert("茶","차","chá",1);
        dbHelper.hsk_insert("差","부족하다","chà",1);
        dbHelper.hsk_insert("长","(길이, 시간 등이)길다","cháng",1);

        dbHelper.hsk_insert("唱歌","노래 부르다","chànggē",1);
        dbHelper.hsk_insert("超市","슈퍼마켓","chāoshì",1);
        dbHelper.hsk_insert("衬衫","셔츠","chènshān",1);
        dbHelper.hsk_insert("成绩","성적","chéngjì",1);
        dbHelper.hsk_insert("城市","도시","chéngshì",1);
        dbHelper.hsk_insert("吃","먹다","chī",1);
        dbHelper.hsk_insert("迟到","지각하다","chídào",1);
        dbHelper.hsk_insert("出","나가다","chū",1);
        dbHelper.hsk_insert("出现","출현하다","chūxiàn",1);
        dbHelper.hsk_insert("出租车","택시","chūzūchē",1);
        dbHelper.hsk_insert("厨房","주방","chúfáng",1);
        dbHelper.hsk_insert("除了","~을 제외하고","chúle",1);
        dbHelper.hsk_insert("穿","(옷을)입다, (신발을)신다","chuān",1);
        dbHelper.hsk_insert("船","선박","chuán",1);
        dbHelper.hsk_insert("春","봄","chūn",1);
        dbHelper.hsk_insert("词语","글자, 어휘","cíyǔ",1);
        dbHelper.hsk_insert("次","번, 차례","cì",1);
        dbHelper.hsk_insert("聪明","총명하다,","cōngming",1);
        dbHelper.hsk_insert("从","~부터","cóng",1);
        dbHelper.hsk_insert("错","틀리다","cuò",1);
        dbHelper.hsk_insert("打电话","전화를 걸다","dǎdiànhuà",1);
        dbHelper.hsk_insert("打篮球","농구를 하다","dǎlánqiú",1);
        dbHelper.hsk_insert("打扫","청소하다","dǎsǎo",1);
        dbHelper.hsk_insert("打算","계획(하다)","dǎsuan",1);
        dbHelper.hsk_insert("大","크다","dà",1);

        dbHelper.hsk_insert("大家","모두","dàjiā",1);
        dbHelper.hsk_insert("带","(몸에) 휴대하다","dài",1);
        dbHelper.hsk_insert("担心","걱정하다","dānxīn",1);
        dbHelper.hsk_insert("蛋糕","케이크","dàngāo",1);
        dbHelper.hsk_insert("但是","그러나","dànshì",1);
        dbHelper.hsk_insert("当然","당연하다","dāngrán",1);
        dbHelper.hsk_insert("到","도착하다","dào",1);
        dbHelper.hsk_insert("地","단어나 구가 상황어로 쓰여 동사/형용사를 수식함","de",1);
        dbHelper.hsk_insert("的","de","~의, ~의 것",1);
        dbHelper.hsk_insert("得","술어 뒤에 쓰여 결과나 정도를 나타내는 보어를 연결","de",1);
        dbHelper.hsk_insert("灯","dēng","등, 등불",1);
        dbHelper.hsk_insert("等","기다리다; 등(열거)","děng",1);
        dbHelper.hsk_insert("低","(높이)낮다","dī",1);
        dbHelper.hsk_insert("弟弟","남동생","dìdi",1);
        dbHelper.hsk_insert("地方","장소","dìfang",1);
        dbHelper.hsk_insert("地铁","지하철","dìtiě",1);
        dbHelper.hsk_insert("地图","지도","dìtú",1);
        dbHelper.hsk_insert("第一","첫 번째","dìyī",1);
        dbHelper.hsk_insert("点","시간의 단위","diǎn",1);
        dbHelper.hsk_insert("电脑","컴퓨터","diànnǎo",1);
        dbHelper.hsk_insert("电视","TV","diànshì",1);
        dbHelper.hsk_insert("电梯","엘리베이터","diàntī",1);
        dbHelper.hsk_insert("电影","영화","diànyǐng",1);
        dbHelper.hsk_insert("电子邮件","이메일","diànzǐyóujiàn",1);
        dbHelper.hsk_insert("东","동쪽","dōng",1);

        dbHelper.hsk_insert("东西","물건","dōngxi",2);
        dbHelper.hsk_insert("冬","겨울","dōng",2);
        dbHelper.hsk_insert("懂","이해하다","dǒng",2);
        dbHelper.hsk_insert("动物","동물","dòngwù",2);
        dbHelper.hsk_insert("都","모두","dōu",2);
        dbHelper.hsk_insert("读","읽다; 공부하다","dú",2);
        dbHelper.hsk_insert("短","(길이) 짧다","duǎn",2);
        dbHelper.hsk_insert("段","(가늘고 긴 물건의) 토막","duàn",2);
        dbHelper.hsk_insert("锻炼","단련하다","duànliàn",2);
        dbHelper.hsk_insert("对","~에 대하여, ~에게; 옳다","duì",2);
        dbHelper.hsk_insert("对不起","미안하다","duìbuqǐ",2);
        dbHelper.hsk_insert("多","많다","duō",2);
        dbHelper.hsk_insert("多么","얼마나[정도나 수량을 물음]","duōme",2);
        dbHelper.hsk_insert("多少","얼마[수량을 물음]","duōshǎo",2);
        dbHelper.hsk_insert("饿","배고프다","è",2);
        dbHelper.hsk_insert("而且","~뿐만 아니라","érqiě",2);
        dbHelper.hsk_insert("儿子","아들","érzi",2);
        dbHelper.hsk_insert("耳朵","귀","ěrduo",2);
        dbHelper.hsk_insert("二","둘","èr",2);
        dbHelper.hsk_insert("发烧","열이 나다","fāshāo",2);
        dbHelper.hsk_insert("发现","발견하다","fāxiàn",2);
        dbHelper.hsk_insert("饭馆","식당","fànguǎn",2);
        dbHelper.hsk_insert("方便","편리하다","fāngbiàn",2);
        dbHelper.hsk_insert("房间","방","fángjiān",2);
        dbHelper.hsk_insert("放","놓아주다, 놓다","fàng",2);

        dbHelper.hsk_insert("放心","안심하다","fàngxīn",2);
        dbHelper.hsk_insert("非常","굉장히","fēicháng",2);
        dbHelper.hsk_insert("飞机","비행기","fēijī",2);
        dbHelper.hsk_insert("分","나누다; 분(시간의 단위]); 펀(중국의 화폐 단위)","fēn",2);
        dbHelper.hsk_insert("分钟","분(시간)","fēnzhōng",2);
        dbHelper.hsk_insert("服务员","종업원","fúwùyuán",2);
        dbHelper.hsk_insert("附近","부근","fùjìn",2);
        dbHelper.hsk_insert("复习","복습하다","fùxí",2);
        dbHelper.hsk_insert("干净","깨끗하다","gānjìng",2);
        dbHelper.hsk_insert("敢","감히~하다","gǎn",2);
        dbHelper.hsk_insert("感冒","감기","gǎnmào",2);
        dbHelper.hsk_insert("刚才","방금","gāngcái",2);
        dbHelper.hsk_insert("高","(높이)놓다, (키)크다","gāo",2);
        dbHelper.hsk_insert("高兴","즐겁다","gāoxìng",2);
        dbHelper.hsk_insert("告诉","알리다","gàosù",2);
        dbHelper.hsk_insert("哥哥","나이가 많은 남자 형제(오빠, 형)","gēge",2);
        dbHelper.hsk_insert("个","개(특정한 양사를 가지지 않는 명사를 셈)","ge",2);
        dbHelper.hsk_insert("给","주다; ~에게~을 주다","gěi",2);
        dbHelper.hsk_insert("跟","~와","gēn",2);
        dbHelper.hsk_insert("根据","~에 근거하여","gēnjù",2);
        dbHelper.hsk_insert("更","더욱","gēng",2);
        dbHelper.hsk_insert("公共汽车","버스","gōnggòng qìchē",2);
        dbHelper.hsk_insert("公斤","킬로그램","gōngjīn",2);
        dbHelper.hsk_insert("公司","회사","gōngsī",2);
        dbHelper.hsk_insert("公园","공원","gōngyuán",2);

        dbHelper.hsk_insert("工作","gōngzuò ","일하다, 작업",2);
        dbHelper.hsk_insert("狗","gǒu","개(동물)",2);
        dbHelper.hsk_insert("故事","gùshì","이야기",2);
        dbHelper.hsk_insert("刮风","guāfēng","바람이 불다",2);
        dbHelper.hsk_insert("关","guān","닫다",2);
        dbHelper.hsk_insert("关系","guānx","관계",2);
        dbHelper.hsk_insert("关心","guānxīn","관심을 가지다",2);
        dbHelper.hsk_insert("关于","guānyú ","~에 관하여",2);
        dbHelper.hsk_insert("贵","guì","비싸다",2);
        dbHelper.hsk_insert("国家","guójiā","나라",2);
        dbHelper.hsk_insert("果汁","guǒzhī","과일주스",2);
        dbHelper.hsk_insert("过去","guòqù","과거, 지나가다",2);
        dbHelper.hsk_insert("过","guò","동사 뒤에 쓰여 경험을 나타냄",2);
        dbHelper.hsk_insert("还","hái","여전히, 아직도, 또",2);
        dbHelper.hsk_insert("还是","háishi","여전히, 그래도, ~하는 것이 낫다",2);
        dbHelper.hsk_insert("孩子","háizi","아이",2);
        dbHelper.hsk_insert("害怕","hàipà","무서워하다",2);
        dbHelper.hsk_insert("汉语","Hànyǔ","중국어",2);
        dbHelper.hsk_insert("好","hǎo","좋다",2);
        dbHelper.hsk_insert("好吃","hǎochī","맛있다",2);
        dbHelper.hsk_insert("号","hào","일(날짜)",2);
        dbHelper.hsk_insert("喝","hē","마시다",2);
        dbHelper.hsk_insert("和","hé","~와",2);
        dbHelper.hsk_insert("河","hé","강",2);
        dbHelper.hsk_insert("黑","hēi","검다",2);
        dbHelper.hsk_insert("黑板","hēibǎn","칠판",2);

        dbHelper.hsk_insert("很","hěn","매우",2);
        dbHelper.hsk_insert("红","hóng","붉다",2);
        dbHelper.hsk_insert("后面","hòumiàn","뒤쪽",2);
        dbHelper.hsk_insert("护照","hùzhào","여권",2);
        dbHelper.hsk_insert("花","huā","꽃, (시간, 금전)소비하다, 쓰다",2);
        dbHelper.hsk_insert("花园","huāyuán","화원",2);
        dbHelper.hsk_insert("画","huà","그리다, 그림",2);
        dbHelper.hsk_insert("坏","huài","나쁘다, 고장 나다",2);
        dbHelper.hsk_insert("欢迎","huānyíng","환영하다",2);
        dbHelper.hsk_insert("还","huán","돌려주다",2);
        dbHelper.hsk_insert("环境","huánjìng","환경",2);
        dbHelper.hsk_insert("换","huàn","교환하다",2);
        dbHelper.hsk_insert("黄","huáng","노랗다",2);
        dbHelper.hsk_insert("回","huí","돌아가다, 돌아오다",2);
        dbHelper.hsk_insert("回答","huídá","대답하다",2);
        dbHelper.hsk_insert("会","huì","~할 수 있다, ~할 것이다",2);
        dbHelper.hsk_insert("会议","huìyì","회의",2);
        dbHelper.hsk_insert("火车站","huǒchēzhàn","기차역",2);
        dbHelper.hsk_insert("或者","huòzhě","혹은",2);
        dbHelper.hsk_insert("机场","jīchǎng","공항",2);
        dbHelper.hsk_insert("鸡蛋","jīdàn","달걀",2);
        dbHelper.hsk_insert("几乎","jīhū","거의",2);
        dbHelper.hsk_insert("机会","jīhuì","기회",2);
        dbHelper.hsk_insert("极","jí","극히, 대단히",3);
        dbHelper.hsk_insert("几","jǐ","몇(의문대명사)",3);

        dbHelper.hsk_insert("记得","jìde","기억하고 있다",3);
        dbHelper.hsk_insert("季节","jìjié","계절",3);
        dbHelper.hsk_insert("家","jiā","집, 기업, 가게 등을 세는 양사",3);
        dbHelper.hsk_insert("检查","jiǎnchá","검사하다",3);
        dbHelper.hsk_insert("简单","jiǎndān","간단하다",3);
        dbHelper.hsk_insert("件","jiàn","옷, 짐 등을 세는 양사",3);
        dbHelper.hsk_insert("健康","jiànkāng","건강(하다)",3);
        dbHelper.hsk_insert("见面","jiànmiàn","만나다",3);
        dbHelper.hsk_insert("讲","jiǎng","말하다, 강연하다",3);
        dbHelper.hsk_insert("教","jiāo","가르치다",3);
        dbHelper.hsk_insert("角","jiǎo","지아오(중국의 화폐단위)",3);
        dbHelper.hsk_insert("脚","jiǎo","발",3);
        dbHelper.hsk_insert("叫","jiào","부르다, ~에게 ~을 당하다",3);
        dbHelper.hsk_insert("教室","jiàoshì","교실",3);
        dbHelper.hsk_insert("接","jiē","연결하다, 마중하다",3);
        dbHelper.hsk_insert("街道","jiēdào","큰길, 거리",3);
        dbHelper.hsk_insert("结婚","jiéhūn","결혼하다",3);
        dbHelper.hsk_insert("结束","jiéshù","끝나다",3);
        dbHelper.hsk_insert("节目","jiémù","프로그램",3);
        dbHelper.hsk_insert("节日","jiérì","기념일, 명절",3);
        dbHelper.hsk_insert("姐姐","jiějie","나이가 많은 여자형제(언니, 누나)",3);
        dbHelper.hsk_insert("解决","jiějué","해결하다",3);
        dbHelper.hsk_insert("借","jiè","빌리다",3);
        dbHelper.hsk_insert("介绍","jièshào","소개하다",3);
        dbHelper.hsk_insert("今天","jīntiān","오늘",3);

        dbHelper.hsk_insert("进","jìn","(앞으로)나아가다, (안으로)들어가다",3);
        dbHelper.hsk_insert("近","jìn","가깝다",3);
        dbHelper.hsk_insert("经常","jīngcháng","항상",3);
        dbHelper.hsk_insert("经过","jīngguò","거치다, 과정",3);
        dbHelper.hsk_insert("经理","jīnglǐ","사장",3);
        dbHelper.hsk_insert("九","jiǔ","아홉",3);
        dbHelper.hsk_insert("久","jiǔ","(시간)길다, 오래다",3);
        dbHelper.hsk_insert("旧","jiù","과거의; 낡다",3);
        dbHelper.hsk_insert("就","jiù","바로, 곧",3);
        dbHelper.hsk_insert("举行","jǔxíng","개최하다",3);
        dbHelper.hsk_insert("句子","jùz","문장",3);
        dbHelper.hsk_insert("觉得","juéde","~라고 느끼다, 생각하다",3);
        dbHelper.hsk_insert("决定","juédìng","결정하다",3);
        dbHelper.hsk_insert("咖啡","kāfēi","커피",3);
        dbHelper.hsk_insert("开","kāi","열다, (전원)켜다",3);
        dbHelper.hsk_insert("开始","kāishǐ","시작하다",3);
        dbHelper.hsk_insert("看","kàn","보다",3);
        dbHelper.hsk_insert("看见","kànjiàn","보다",3);
        dbHelper.hsk_insert("考试","kǎoshì","시험(치다)",3);
        dbHelper.hsk_insert("渴","kě","목마르다",3);
        dbHelper.hsk_insert("可爱","kě’ài","귀엽다",3);
        dbHelper.hsk_insert("可能","kěnéng","아마도",3);
        dbHelper.hsk_insert("可以","kěyǐ","~할 수 있다",3);
        dbHelper.hsk_insert("刻","kè","15분",3);
        dbHelper.hsk_insert("课","kè","수업",3);

        dbHelper.hsk_insert("客人","kèrén","손님",3);
        dbHelper.hsk_insert("空调","kōngtiáo","에어컨",3);
        dbHelper.hsk_insert("口","kǒu","식구[가족을 셀 때 쓰는 양사]",3);
        dbHelper.hsk_insert("哭","kū","울다",3);
        dbHelper.hsk_insert("裤子","kùzi","바지",3);
        dbHelper.hsk_insert("块","kuài","위앤(중국의 화폐 단위)",3);
        dbHelper.hsk_insert("快","kuài","빠르다",3);
        dbHelper.hsk_insert("快乐","kuàilè","즐겁다",3);
        dbHelper.hsk_insert("筷子","kuàiz","젓가락",3);
        dbHelper.hsk_insert("来","lái","오다",3);
        dbHelper.hsk_insert("蓝","lán","파란색의",3);
        dbHelper.hsk_insert("老","lǎo","늙다, 오래되다",3);
        dbHelper.hsk_insert("老师","lǎoshī","선생님",3);
        dbHelper.hsk_insert("了","le","동사뒤에 쓰여 완료, 변화를 나타냄",3);
        dbHelper.hsk_insert("累","lèi","피곤하다",3);
        dbHelper.hsk_insert("冷","lěng","춥다",3);
        dbHelper.hsk_insert("离","lí","~로부터",3);
        dbHelper.hsk_insert("离开","líkāi","떠나다",3);
        dbHelper.hsk_insert("里","lǐ","안",3);
        dbHelper.hsk_insert("礼物","lǐwù","선물",3);
        dbHelper.hsk_insert("历史","lìshǐ","역사",3);
        dbHelper.hsk_insert("脸","liǎn","얼굴",3);
        dbHelper.hsk_insert("练习","liànxí","연습(하다)",3);
        dbHelper.hsk_insert("两","liǎng","둘",3);
        dbHelper.hsk_insert("辆","liàng","대(차량을 세는 양사)",3);

        dbHelper.hsk_insert("了解","liǎojiě","이해하다",3);
        dbHelper.hsk_insert("邻居","línjū","이웃",3);
        dbHelper.hsk_insert("零","líng","숫자 0",3);
        dbHelper.hsk_insert("六","liù","육",3);
        dbHelper.hsk_insert("楼","lóu","건물, 층",3);
        dbHelper.hsk_insert("路","lù","길",3);
        dbHelper.hsk_insert("旅游","lǚyóu","여행하다",3);
        dbHelper.hsk_insert("绿","lǜ","녹색의",3);
        dbHelper.hsk_insert("妈妈","māma","어머니",3);
        dbHelper.hsk_insert("马","mǎ","말(동물)",3);
        dbHelper.hsk_insert("马上","mǎshàng","곧, 바로",3);
        dbHelper.hsk_insert("吗","má","문장 끝에 쓰여 의문의 어기를 나타냄",3);
        dbHelper.hsk_insert("买","mǎi","사다",3);
        dbHelper.hsk_insert("卖","mài","팔다",3);
        dbHelper.hsk_insert("满意","mǎnyì","만족하다",3);
        dbHelper.hsk_insert("慢","màn","느리다",3);
        dbHelper.hsk_insert("忙","máng","바쁘다",3);
        dbHelper.hsk_insert("猫","māo","고양이",3);
        dbHelper.hsk_insert("帽子","màozi","모자",3);
        dbHelper.hsk_insert("没","méi","없다; 과거의 부정",3);
        dbHelper.hsk_insert("没关系","méiguānxi","괜찮다",3);
        dbHelper.hsk_insert("每","měi","매, 각, ~마다",3);
        dbHelper.hsk_insert("妹妹","mèimei","여동생",3);
        dbHelper.hsk_insert("门","mén","문",3);






    }
}

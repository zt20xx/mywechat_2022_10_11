package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {

    private RecyclerView recyclerView;
    private Context context;
    private Adapter_chat myadapter;
    private List<String> listdata = new ArrayList<>();
    private List<String> listname = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.tab01, container, false);

        recyclerView = view.findViewById(R.id.recy01);
        listdata();
        listname();
        Viewinit();
        return view;
    }

    private void Viewinit() {
        context = this.getActivity();
        myadapter = new Adapter_chat(context);
        //设置LayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(myadapter);
        myadapter.listdata(listdata);
        myadapter.listname(listname);
    }

    private void listdata() {
        listdata.add("——总序解读作家是难事，何况是陀思妥耶夫斯基这样的作家。一个半世纪以来，文学家、思想家、评论家，以至革命家们，虽然对陀氏其人其文多有阐发，却是众口异词，甚或径相抵牾。");
        listdata.add("陀氏小说对世界和人性的思考和剖视，把小说这个文学体裁推到了思想的前沿。小说家不是政治家或哲学家，重要的不在他能提出什么医治人生和社会的良方，因为这时他们往往是既幼稚又可笑的。文学的力量在于敏锐的发现，表现的深刻，在感性的图像里展示世界的真相和人性深处的奥秘。就这一点来说，陀思妥耶夫斯基是做得非常出色的，可以说达到了前所未有的时代的高度。");
        listdata.add("陀氏一生始终没能摆脱癫痫症对他生理上、精神上造成的巨大痛苦，而嗜赌成性和债务缠身又压得他经济上永世不得翻身。说来也许近乎残忍，长达九年的流刑经历为陀氏写《死屋手记》提供了无价的第一手资料，此书曾被屠格涅夫比作但丁的《神曲·地狱篇》，赫尔岑则把它与米开朗琪罗的壁画《最后的审判》相提并论，它更在一个世纪后催生了诺贝尔奖得主索尔仁尼琴的一系列劳改文学名作，如《伊万·杰尼索维奇的一天》、《癌病房》、《古拉格群岛》等。与此相类似，频频发作而且病势不断加重的癫痫、明知结局有输无赢也要饮鸩止渴的赌瘾、越陷越深以致永远无法清偿的债务——这些亲身体验都成了陀氏的创作源泉，就描写的真切性和刻画的深度而言，其他途径都无法与之相比拟。");
        listdata.add("译后记我在念高中的时候，曾如饥似渴地吞咽过不少外国文学（包括戏剧）的译本，其中尤以阅读傅雷所译的巴尔扎克人间喜剧系列小说和文化生活出版社那些黑白封面的欧美名著（如巴金、丽尼、陆蠡译述的屠格涅夫作品等等）兴趣最浓。虽然我从未系统研读过欧洲文学史之类的专著，但经常在书店里站着翻阅一些久闻大名的经典，看到那里陈列陀思妥耶夫斯基的作品之多，对这位俄国大文豪早就肃然起敬。");
        listdata.add("a");
        listdata.add("a");
        listdata.add("a");
        listdata.add("a");
        listdata.add("a");
        listdata.add("a");

    }

    private void listname() {
        listname.add("张三");
        listname.add("李四");
        listname.add("王五");
        listname.add("赵六");
        listname.add("订阅号消息");
        listname.add("微信支付");
        listname.add("服务通知");
        listname.add("微信读书");
        listname.add("QQ邮箱提醒");
    }


}
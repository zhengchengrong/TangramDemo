package com.holiday.tangram.util;

/**
 * 模拟数据源
 */
public class DataUtil {
    //from https://shibe.online/ 貌似加载不了
    static String[] imgs = {"https://cdn.shibe.online/shibes/3a3f1a5dfbcdfb36834166e64a8d70f8a0e538ae.jpg", "https://cdn.shibe.online/shibes/133cdd65d7ded83f83fec27309d170b3cb24ba4d.jpg", "https://cdn.shibe.online/shibes/4b96545a044b66ffd5c2aba40cce01a285ca723e.jpg", "https://cdn.shibe.online/shibes/9aee35c7baebaca4acf9200082f1ee9f9eeaaed9.jpg", "https://cdn.shibe.online/shibes/8990d9eab8c47234f24fa7b1f31c58f28bdcce80.jpg", "https://cdn.shibe.online/shibes/ee680eb46575af775d4a2c64f1cc52bfc8063cef.jpg", "https://cdn.shibe.online/shibes/17190b121fa4213d5e4e154da57d0ceb3dce33d0.jpg", "https://cdn.shibe.online/shibes/4bb5f6d893eea55f63bea66b842f498ff97f5fa3.jpg", "https://cdn.shibe.online/shibes/3a1dde97eb9b6135344ae4f86e771d4cbbcb10db.jpg", "https://cdn.shibe.online/shibes/189733e44509fe785cb50b978a25c698b858cff4.jpg", "https://cdn.shibe.online/shibes/7414a8faa97f86b5a99f236d1068bf5a975cd7c5.jpg", "https://cdn.shibe.online/shibes/648565dd824188edd1ca81357cd7fcbe2cec96bc.jpg", "https://cdn.shibe.online/shibes/ee18d82d0af0316db5d96e9388afea9417706655.jpg", "https://cdn.shibe.online/shibes/4519ce6a759ac099a11b9a2755ab8aeb68b98999.jpg", "https://cdn.shibe.online/shibes/4d47dbab92efe4969ecc19d8390e510602052f36.jpg", "https://cdn.shibe.online/shibes/7eba25846f69b01ec04de1cae9fed4b45c203e87.jpg", "https://cdn.shibe.online/shibes/f689cf3917388f2239d7ffc45f79101019cd9b50.jpg", "https://cdn.shibe.online/shibes/09600515a276e3087a14601e7900bfc63c054a9f.jpg", "https://cdn.shibe.online/shibes/d28467088a79d36cf3c0ac1994078fdd524a0c2d.jpg", "https://cdn.shibe.online/shibes/9fa8ec71e43f5b59fac955deb2a7406df7181ce3.jpg", "https://cdn.shibe.online/shibes/290315f81877fe820b370508b4ae9817aeb71d17.jpg", "https://cdn.shibe.online/shibes/5edf029a55e589ba1975c5e12d89b905d67547b6.jpg", "https://cdn.shibe.online/shibes/6a1f6f8681d192a1087956f4e9be485eb189b9dd.jpg", "https://cdn.shibe.online/shibes/4faa50076861ebd6413fe879bc9a77b79645bfc7.jpg", "https://cdn.shibe.online/shibes/e3afe3193cca532fa0c62d180078819a7bfd4597.jpg", "https://cdn.shibe.online/shibes/5f4e3396cce09a178b5d6c153724f0126426bd28.jpg", "https://cdn.shibe.online/shibes/b2d9469cdae337f4cd5f21dccfda8c705c2df80f.jpg", "https://cdn.shibe.online/shibes/554a607e9f00cec91b4242703ad61d69d2f990d2.jpg", "https://cdn.shibe.online/shibes/d9126eb620207f6ee2f817d6e1ae99f0b28962b8.jpg", "https://cdn.shibe.online/shibes/fa0d51c7eaff819e22a9218deec439be000ede63.jpg", "https://cdn.shibe.online/shibes/cb73af0f72436116ee27df2bc7c722eae352dd6b.jpg", "https://cdn.shibe.online/shibes/3ac766e18ee3c45d9e4cbc2305719a248598ce25.jpg", "https://cdn.shibe.online/shibes/6a1ef70a21d06e9716d0e73ad2faaa70db798394.jpg", "https://cdn.shibe.online/shibes/9dcacc26817421416b5deaa968f8e785c91f4ad2.jpg", "https://cdn.shibe.online/shibes/f4374a7b8591946a8cc7a7aee4021a9fb57fd677.jpg", "https://cdn.shibe.online/shibes/b12ce9796d3846d135d18699621df65de354823e.jpg", "https://cdn.shibe.online/shibes/a82d1e6688404526bff473a361ceaef176f29442.jpg", "https://cdn.shibe.online/shibes/9a0ef91317bcaa5d7637b643a93f20dd31778e21.jpg", "https://cdn.shibe.online/shibes/92ad556f68f4eacf25dd46adf330a90046766b1e.jpg", "https://cdn.shibe.online/shibes/532d3123ef4a8ed1310ac8aa4943de341896437c.jpg", "https://cdn.shibe.online/shibes/077998ed5d80f309383b73bc2596abb0a1dc3cfe.jpg", "https://cdn.shibe.online/shibes/471a2189dda9453572e43aa658d8242e6390597d.jpg", "https://cdn.shibe.online/shibes/131a907fdf3034b25ef13a8c8be33d39774f2f51.jpg", "https://cdn.shibe.online/shibes/3d592b4309dc9e208e2e47e9dec668ade61e2ebe.jpg", "https://cdn.shibe.online/shibes/83107a2bd2071ee8e127a7597bbeec2c7d56dedc.jpg", "https://cdn.shibe.online/shibes/0a11d92f7817c314acac494147cec7e821daf9ae.jpg", "https://cdn.shibe.online/shibes/5fcdfb9dae06fff466a45005523a46f6ad022b4e.jpg", "https://cdn.shibe.online/shibes/58aca9ca30b31c2b2ab9246ee8c4d2135a5f34b9.jpg", "https://cdn.shibe.online/shibes/6f657d871c09e78149cc10e0c6eaf06abd3afc11.jpg", "https://cdn.shibe.online/shibes/91e10be77f605d10010bc944e8e05c029cb9932f.jpg", "https://cdn.shibe.online/shibes/fc8e141ab0d21a93000a7e7ec3da92bfb1633d58.jpg", "https://cdn.shibe.online/shibes/e753ca41d045ca4dc7c00b85e9e65b77398ec489.jpg", "https://cdn.shibe.online/shibes/29ac4b572addbe4b8f163e8189c05c5b3d2af8ae.jpg", "https://cdn.shibe.online/shibes/368d0358ec60e1749223cc7363c1e989275b8fac.jpg", "https://cdn.shibe.online/shibes/d3c39966feaf4f3c708995446061c47450f3c988.jpg", "https://cdn.shibe.online/shibes/e47a150a99f25249c7e4ab58ef1f5c40af90929e.jpg", "https://cdn.shibe.online/shibes/5ba8d4bda404d9e6fe9e19412aae8b3ab2ed70a2.jpg", "https://cdn.shibe.online/shibes/d3960e606e70ef84c3e2e113cae6f77d29bde4aa.jpg", "https://cdn.shibe.online/shibes/ada9b419ecf7df1144c65547a5a4d4c5d337bc59.jpg", "https://cdn.shibe.online/shibes/250bd926c8407506720622a0d8ddadbb394e2a5b.jpg", "https://cdn.shibe.online/shibes/6ec3d55cc9401bdffecd07e991d3959be9b590e8.jpg", "https://cdn.shibe.online/shibes/46a3a474fccc824599b183274ac1711b8ca36a03.jpg", "https://cdn.shibe.online/shibes/87b02540dccde78483c9b95003ff2418d13fd695.jpg", "https://cdn.shibe.online/shibes/4170233c7be1aeee0fe48d36083cc88e50336118.jpg", "https://cdn.shibe.online/shibes/e3b0302ed4f359f78d1e033ed9781443324bae86.jpg", "https://cdn.shibe.online/shibes/4967ac961170da7ce430bc598d8613943d16fa7d.jpg", "https://cdn.shibe.online/shibes/637598a8e0affffc34f56e03016909e9fabd7092.jpg", "https://cdn.shibe.online/shibes/066e9615f203f08856c8e905a6abcb3e39df9e5d.jpg", "https://cdn.shibe.online/shibes/177b860903b047a5560db54917e20b4c3c04687c.jpg", "https://cdn.shibe.online/shibes/6a2e676c55447568c42eab964e90747d5802fb20.jpg", "https://cdn.shibe.online/shibes/46a4d6a24e00fc45d29940a6b7cd2e8f6f1c4769.jpg", "https://cdn.shibe.online/shibes/932f8ffe1b1c3c577c3d21bb2c2f3590bce312dd.jpg", "https://cdn.shibe.online/shibes/1241372a5df3b04b2d2c4f52af04d1f0cb80652a.jpg", "https://cdn.shibe.online/shibes/035e7aad74a6c2763c4bda50ce10c7576c005b5f.jpg", "https://cdn.shibe.online/shibes/bfe78e67f66305d3ac23d5d690d8c7cfea24c785.jpg", "https://cdn.shibe.online/shibes/a9b5daf8e6ad4b8636e7f8e9d184c9a9e380aded.jpg", "https://cdn.shibe.online/shibes/9993f431c6e9a6565f25aa7e879d14aa99cb6f4e.jpg", "https://cdn.shibe.online/shibes/058d05f51b697b62055e43d6c136f2a7513d17a8.jpg", "https://cdn.shibe.online/shibes/1ae466fe6ac5d4591f5c9fc25ac19cffce8805e3.jpg", "https://cdn.shibe.online/shibes/3a109d05e774a08ab9330457044f95089292661b.jpg", "https://cdn.shibe.online/shibes/f516e931b9d63eda7a644e91107d5495d0a83935.jpg", "https://cdn.shibe.online/shibes/65242993809e87434ddf774867d2aa1bf690445a.jpg", "https://cdn.shibe.online/shibes/a5b9dcf065f9028461e7f78191ccc144dfb58084.jpg", "https://cdn.shibe.online/shibes/d00617f9ca5c9a4ebd9a4b2323cdd01a6138293c.jpg", "https://cdn.shibe.online/shibes/534d6c307d768cd4224e316da9f7a8fb5c695c69.jpg", "https://cdn.shibe.online/shibes/73c2ea33968d18a32c0dc062c2de16c9069bdaa5.jpg", "https://cdn.shibe.online/shibes/5abe3d4189da0f37391a16113b632a6d6d96ba71.jpg", "https://cdn.shibe.online/shibes/ec0764eba11649f95d7f60e0af36d064ea293cac.jpg", "https://cdn.shibe.online/shibes/cc0f04c77fe0e4a9d649c1e18daf865583d709b2.jpg", "https://cdn.shibe.online/shibes/8f1cffb5a64fe6371e29c0aaf498dac66ec1fee2.jpg", "https://cdn.shibe.online/shibes/8e3d195724e12a14916ff013df5c6301b4f218a4.jpg", "https://cdn.shibe.online/shibes/3d90a3fa154009ffebb0e4d0a93f9c37ac283bf9.jpg", "https://cdn.shibe.online/shibes/dde6a27f20c3846d8a966249eb34df66f437e7d2.jpg", "https://cdn.shibe.online/shibes/de0dd261ff3163af2a8d77662e277d0c58dbc2c3.jpg", "https://cdn.shibe.online/shibes/5d39087aa2762de4b52adcd31e214b00b705b0c5.jpg", "https://cdn.shibe.online/shibes/70648ede8cd9ec01937b4b636565210d3a4f08aa.jpg", "https://cdn.shibe.online/shibes/8c55e9795720272f68e7bff4c16b578246312953.jpg", "https://cdn.shibe.online/shibes/a5dfd8b33ccee28171c18d49ff360c8d99b85487.jpg", "https://cdn.shibe.online/shibes/486fba0e0473904165706965c962bb7f76fef87a.jpg", "https://cdn.shibe.online/shibes/fc9d0305515becfc13bd20a48cbdce50084956bd.jpg"};

    public static String getImgByIdx(int idx) {
//        return imgs[idx % imgs.length];

        //from https://picsum.photos/
        return "https://i.picsum.photos/id/" + (idx % 300) + "/200/200.jpg";
    }
}

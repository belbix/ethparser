package pro.belbix.ethparser.web3.contracts;

import static pro.belbix.ethparser.web3.contracts.LpContract.createLpContracts;

import java.util.List;

class UniPairAddresses {

    private UniPairAddresses() {
    }

    static final List<LpContract> UNI_PAIRS = createLpContracts(
        new LpContract(10042267, "UNI_LP_ETH_DAI", "DAI", "0xA478c2975Ab1Ea89e8196811F51A7B7Ade33eB11"),
        new LpContract(10008355, "UNI_LP_USDC_ETH", "ETH", "0xB4e16d0168e52d35CaCD2c6185b44281Ec28C9Dc"),
        new LpContract(10093341, "UNI_LP_ETH_USDT", "USDT", "0x0d4a11d5EEaaC28EC3F61d100daF4d40471f1852"),
        new LpContract(10091097, "UNI_LP_ETH_WBTC", "WBTC", "0xBb2b8038a1640196FbE3e38816F3e67Cba72D940"),
        new LpContract(10994541, "SUSHI_LP_WBTC_TBTC", "TBTC", "0x2Dbc7dD86C6cd87b525BD54Ea73EBeeBbc307F68"),
        new LpContract(10092348, "UNI_LP_USDC_WBTC", "", "0x004375dff511095cc5a197a54140a24efef3a416"),
        new LpContract(10777016, "UNI_LP_USDC_FARM", "FARM", "0x514906fc121c7878424a5c928cad1852cc545892"),
        new LpContract(10777652, "UNI_LP_WETH_FARM", "FARM", "0x56feaccb7f750b997b36a68625c7c596f0b41a58"),
        new LpContract(11004221, "UNI_LP_IDX_ETH", "IDX", "0x3452a7f30a712e415a0674c0341d44ee9d9786f9"),
        new LpContract(11096263, "UNI_LP_USDC_IDX", "", "0xc372089019614e5791b08b5036f298d002a8cbef"),
        new LpContract(10836224, "UNI_LP_ETH_DPI", "DPI", "0x4d5ef58aac27d99935e5b6b4a6778ff292059991"),
        new LpContract(11380633, "UNI_LP_WBTC_BADGER", "BADGER", "0xcd7989894bc033581532d2cd88da5db0a4b12859"),
        new LpContract(10829331, "SUSHI_LP_ETH_DAI", "", "0xc3d03e4f041fd4cd388c549ee2a29a9e5075882f"),
        new LpContract(10829331, "SUSHI_LP_ETH_USDC", "", "0x397ff1542f962076d0bfe58ea045ffa2d347aca0"),
        new LpContract(10822038, "SUSHI_LP_ETH_USDT", "", "0x06da0fd433c1a5d7a4faa01111c044910a184553"),
        new LpContract(10840845, "SUSHI_LP_ETH_WBTC", "", "0xceff51756c56ceffca006cd410b03ffc46dd3a58"),
        new LpContract(11407008, "UNI_LP_GRAIN_FARM", "GRAIN", "0xb9fa44b0911f6d777faab2fa9d8ef103f25ddf49"),
        new LpContract(11355401, "UNI_LP_BAC_DAI", "BAC", "0xd4405f0704621dbe9d4dea60e128e0c3b26bddbd"),
        new LpContract(11355401, "UNI_LP_DAI_BAS", "BAS", "0x0379da7a5895d13037b6937b109fa8607a659adf"),
        new LpContract(11549969, "SUSHI_LP_MIC_USDT", "MIC", "0xC9cB53B48A2f3A9e75982685644c1870F1405CCb"),
        new LpContract(11549972, "SUSHI_LP_MIS_USDT", "MIS", "0x066F3A3B7C8Fa077c71B9184d862ed0A4D5cF3e0"),
        new LpContract(11607878, "ONEINCH_LP_ETH_DAI", "", "0x7566126f2fD0f2Dddae01Bb8A6EA49b760383D5A"),
        new LpContract(11607881, "ONEINCH_LP_ETH_USDC", "", "0xb4dB55a20E0624eDD82A0Cf356e3488B4669BD27"),
        new LpContract(11607877, "ONEINCH_LP_ETH_USDT", "", "0xbBa17b81aB4193455Be10741512d0E71520F43cB"),
        new LpContract(11607880, "ONEINCH_LP_ETH_WBTC", "", "0x6a11F3E5a01D129e566d783A7b6E8862bFD66CcA"),
        new LpContract(11644509, "UNI_LP_DAI_BSG", "BSG", "0x4a9596e5d2f9bef50e4de092ad7181ae3c40353e"),
        new LpContract(11644511, "UNI_LP_DAI_BSGS", "BSGS", "0x980a07e4f64d21a0cb2ef8d4af362a79b9f5c0da"),
        new LpContract(10722560, "UNI_LP_ESD_USDC", "ESD", "0x88ff79eb2bc5850f27315415da8685282c7610f9"),
        new LpContract(11330245, "UNI_LP_USDC_DSD", "DSD", "0x66e33d2605c5fb25ebb7cd7528e7997b0afa55e8"),
        new LpContract(11380524, "UNI_LP_MAAPL_UST", "MAAPL", "0xb022e08adc8ba2de6ba4fecb59c6d502f66e953b"),
        new LpContract(11380782, "UNI_LP_MAMZN_UST", "MAMZN", "0x0Ae8cB1f57e3b1b7f4f5048743710084AA69E796"),
        new LpContract(11380543, "UNI_LP_MGOOGL_UST", "MGOOGL", "0x4b70ccD1Cf9905BE1FaEd025EADbD3Ab124efe9a"),
        new LpContract(11380570, "UNI_LP_MTSLA_UST", "MTSLA", "0x5233349957586A8207c52693A959483F9aeAA50C"),
        new LpContract(10097736, "UNI_LP_USDC_EURS", "EURS", "0x767055e2a9f15783b1ec5ef134a89acf3165332f"),
        new LpContract(10829340, "SUSHI_LP_SUSHI_ETH", "SUSHI", "0x795065dCc9f64b5614C407a6EFDC400DA6221FB0"),
        new LpContract(11038392, "UNI_LP_HBTC_ETH", "HBTC", "0xa6f4eae7fdaa20e632c45d4cd39e4f3961892322"),
        new LpContract(10161671, "UNI_LP_ETH_RENBTC", "RENBTC", "0x81fbef4704776cc5bba0a5df3a90056d2c6900b3"),
        new LpContract(10161671, "UNI_LP_TUSD_ETH", "TUSD", "0xb4d0d9df2738abe81b87b66c80851292492d1404"),
        new LpContract(10161671, "UNI_LP_UST_USDT", "UST", "0xc50ef7861153c51d383d9a7d48e6c9467fb90c38"),
        new LpContract(10161671, "UNI_LP_GUSD_ETH", "GUSD", "0x61247d8aca1c485a50728e1336d9b26c8339e701"),
        new LpContract(10161671, "UNI_LP_USDT_HUSD", "HUSD", "0xe53bfffd5d9a53250a3f30409fdc463cb5ed05e1"),
        new LpContract(11819340, "UNI_LP_BASv2_DAI", "BASv2", "0x3E78F2E7daDe07ea685F8612F00477FD97162F1e"),
        new LpContract(11607879, "ONEINCH_LP_ONEINCH_ETH", "ONEINCH", "0x0EF1B8a0E726Fc3948E15b23993015eB1627f210"),
        new LpContract(11519620, "UNI_LP_ONEINCH_ETH", "ONEINCH", "0x26aAd2da94C59524ac0D93F6D6Cbf9071d7086f2"),
        new LpContract(11733661, "UNI_LP_WBTC_KBTC", "KBTC", "0x1f3d61248ec81542889535595903078109707941"),
        new LpContract(11733686, "UNI_LP_WBTC_KLON", "KLON", "0x734e48a1ffea1cdf4f5172210c322f3990d6d760")

    );
}

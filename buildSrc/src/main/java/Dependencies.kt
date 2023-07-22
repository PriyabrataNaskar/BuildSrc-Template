object Dependencies {

    object Android {
        private const val coreKtxVersion = "1.10.1"
        private const val lifecycleVersion = "2.6.1"
        private const val activityComposeVersion = "1.5.1"
        private const val materialDesigningVersion = "1.9.0"
        private const val constraintLayoutVersion = "2.1.4"
        private const val appCompatVersion = "1.6.1"

        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
        const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
        const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
        const val materialDesigning =
            "com.google.android.material:material:$materialDesigningVersion"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    }
}

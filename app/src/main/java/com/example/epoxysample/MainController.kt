package com.example.epoxysample

import com.airbnb.epoxy.TypedEpoxyController

class MainController : TypedEpoxyController<List<SampleModel>>() {
    override fun buildModels(data: List<SampleModel>?) {
        data ?: return
        data.forEach{
            buildContents(it)
        }
    }

    private fun buildContents(sampleModel: SampleModel){
        header {
            id()
            header(sampleModel.header)
        }

        sampleModel.text.forEach {
            text {
                id()
                text(it)
            }
        }
    }

}